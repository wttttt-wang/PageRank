# PageRank

## Update Log:

* V0.0.1:
  * Simple pageRank function.
  * Iteration
* V1.0:
  * Handle edge cases: dead ends & Spider traps, by PR(N) = (1 - alpha)*PR(N - 1)\*TransitionMatrix + alpha\*PR(N - 1)
  * Add combiners.

## Concepts

* An **algorithm** used by Google Search to **rank websites**.

* Old algorithm: **(Self-Rank)**

  * Not accurate
  * Easily manipulated by human.

* Basic Theory:

  * More important websites are likely to receive **more links** from other websites.
  * Website with higher PageRank will pass **higher weight**.

* **Transition Matrix**:

  * For representing the directivity between pages.

* **PageRank Matrix**:

  * For representing the importance of each website.
  * This is what we need to calculate.
  * Initialization all pages with same value. —> PR0  
  * **PR1 = PR0 * Transition Matrix**…. Iteration
  * Iteration num:  PR will finally **converge**.

* **Edge cases**:

  * Dead ends: No out links.   —> PR(N) matrix will become zeros finally.

  * Spider traps: Only link itself.  —> PR(N) matrix will be dominated by one page.

  * Solution  —> Teleporting：

      PR(N) = (1 - alpha)*PR(N - 1)\*TransitionMatrix + alpha\*PR(N - 1).      【即有1 - alpha的概率跳转，有alpha的概率随便跳转到一个网页(基于网页重要性)。】

* For more details, see Theory below.

## MR Design

* Actually, this is a big matrix production problem.


* Input:

  * pr.txt:    pageIndex\tpr0  for each line
  * transition.txt: pageIndA\tpage1,page2,…pageN     for each line

* MR1:

  * Mapper01:

    * Function: handling transition.txt

    * Input: transition.txt      each line.   

      value —> pageIndA\tpage1,page2,….pageN

    * Output: key —> pageIndA     value —> page1,page2,…pageN=1/N

  * Mapper02:

    * Function: handling pr.txt
    * Input: pr.txt.     each line.    value —> pageIndex\tpr0
    * Output: key —> pageIndex.   value —> pr0

  * Reducer01:

    * Function: calculating pr1 from one source page
    * Input: the output of mapper01 & mapper02.(The problem is how to receive two different type of input.  —> For different input file ,designated different mapper.)
    * Output: key —> pageIndA.   value —> pagei=1/N\*pr0(A).   [Or may be key—>pagei=1/N*pr0(A), key —> Null]

* MR2:

  * Mapper:
    * Function:
    * Input : each line.     value —> pageInA\tpagei=1/N*pr0(A)
    * Output: key —> pagei.   value —> 1/N * pr0(A)
  * Reducer:
    * Function: sum
    * Input: key —> pagei.   value —> Iterable(1/N * pr0(A),…)
    * Output:  key —> pagei.   Value —> pr1(pagei)

## Theory

* **Convergence**:  
  * Use a directive graph to model the behavior of sufers.    This is a **Markov Process**.
  * So, **the requirement to converge is that "The graph is strong connected**".
  * Apparently, in same cases, the graph of links doesn't satisfied the strong connection. What we called edge cases.
  * The solution is, considering a sufer may have **a probablity of alpha** to ju mp to a random page.
* Using MR:
  * So so many links —> A very very large matrix.
  * Considering that the transition matrix is **sparse matrix**. We store the transition matrix by A\tB,C,D.