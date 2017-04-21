[root@host98 ~/wttttt]$hadoop jar PageRank.jar com.wttttt.hadoop.Driver /test/pageRank/transition.txt /test/pageRank/pr.txt /test/midState 20 0.2

17/04/21 10:14:05 WARN util.NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable

17/04/21 10:14:06 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:14:06 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:14:11 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:14:11 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:14:12 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:14:12 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0022

17/04/21 10:14:12 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0022

17/04/21 10:14:12 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0022/

17/04/21 10:14:12 INFO mapreduce.Job: Running job: job_1492140941149_0022

17/04/21 10:14:20 INFO mapreduce.Job: Job job_1492140941149_0022 running in uber mode : false

17/04/21 10:14:20 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:14:25 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:14:31 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:14:35 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:14:36 INFO mapreduce.Job: Job job_1492140941149_0022 completed successfully

17/04/21 10:14:36 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=329506

​		FILE: Number of bytes written=978589

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=279107

​		HDFS: Number of bytes written=712535

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57790

​		Total time spent by all reduces in occupied slots (ms)=32450

​		Total time spent by all map tasks (ms)=5779

​		Total time spent by all reduce tasks (ms)=3245

​		Total vcore-seconds taken by all map tasks=11558

​		Total vcore-seconds taken by all reduce tasks=6490

​		Total megabyte-seconds taken by all map tasks=118353920

​		Total megabyte-seconds taken by all reduce tasks=66457600

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=311720

​		Map output materialized bytes=329512

​		Input split bytes=521

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=329512

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=179

​		CPU time spent (ms)=6200

​		Physical memory (bytes) snapshot=1115664384

​		Virtual memory (bytes) snapshot=59342581760

​		Total committed heap usage (bytes)=2270691328

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=712535

17/04/21 10:14:36 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:14:36 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:14:36 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:14:36 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:14:36 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:14:36 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0023

17/04/21 10:14:36 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0023

17/04/21 10:14:36 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0023/

17/04/21 10:14:36 INFO mapreduce.Job: Running job: job_1492140941149_0023

17/04/21 10:14:44 INFO mapreduce.Job: Job job_1492140941149_0023 running in uber mode : false

17/04/21 10:14:44 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:14:49 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:14:54 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:14:59 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:15:00 INFO mapreduce.Job: Job job_1492140941149_0023 completed successfully

17/04/21 10:15:00 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=880276

​		HDFS: Number of bytes written=157117

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=62300

​		Total time spent by all reduces in occupied slots (ms)=31530

​		Total time spent by all map tasks (ms)=6230

​		Total time spent by all reduce tasks (ms)=3153

​		Total vcore-seconds taken by all map tasks=12460

​		Total vcore-seconds taken by all reduce tasks=6306

​		Total megabyte-seconds taken by all map tasks=127590400

​		Total megabyte-seconds taken by all reduce tasks=64573440

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=512

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=198

​		CPU time spent (ms)=7220

​		Physical memory (bytes) snapshot=1157722112

​		Virtual memory (bytes) snapshot=59349893120

​		Total committed heap usage (bytes)=2260205568

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157117

17/04/21 10:15:00 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:15:00 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:15:00 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:15:00 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:15:00 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:15:00 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0024

17/04/21 10:15:01 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0024

17/04/21 10:15:01 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0024/

17/04/21 10:15:01 INFO mapreduce.Job: Running job: job_1492140941149_0024

17/04/21 10:15:07 INFO mapreduce.Job: Job job_1492140941149_0024 running in uber mode : false

17/04/21 10:15:07 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:15:12 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:15:18 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:15:23 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:15:23 INFO mapreduce.Job: Job job_1492140941149_0024 completed successfully

17/04/21 10:15:23 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319394

​		FILE: Number of bytes written=958365

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269008

​		HDFS: Number of bytes written=716405

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57490

​		Total time spent by all reduces in occupied slots (ms)=32990

​		Total time spent by all map tasks (ms)=5749

​		Total time spent by all reduce tasks (ms)=3299

​		Total vcore-seconds taken by all map tasks=11498

​		Total vcore-seconds taken by all reduce tasks=6598

​		Total megabyte-seconds taken by all map tasks=117739520

​		Total megabyte-seconds taken by all reduce tasks=67563520

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301608

​		Map output materialized bytes=319400

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319400

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=178

​		CPU time spent (ms)=6720

​		Physical memory (bytes) snapshot=1098297344

​		Virtual memory (bytes) snapshot=59348492288

​		Total committed heap usage (bytes)=2297430016

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716405

17/04/21 10:15:23 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:15:23 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:15:24 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:15:24 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:15:24 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:15:24 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0025

17/04/21 10:15:24 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0025

17/04/21 10:15:24 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0025/

17/04/21 10:15:24 INFO mapreduce.Job: Running job: job_1492140941149_0025

17/04/21 10:15:31 INFO mapreduce.Job: Job job_1492140941149_0025 running in uber mode : false

17/04/21 10:15:31 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:15:36 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:15:41 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:15:46 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:15:46 INFO mapreduce.Job: Job job_1492140941149_0025 completed successfully

17/04/21 10:15:46 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874047

​		HDFS: Number of bytes written=157147

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60710

​		Total time spent by all reduces in occupied slots (ms)=31450

​		Total time spent by all map tasks (ms)=6071

​		Total time spent by all reduce tasks (ms)=3145

​		Total vcore-seconds taken by all map tasks=12142

​		Total vcore-seconds taken by all reduce tasks=6290

​		Total megabyte-seconds taken by all map tasks=124334080

​		Total megabyte-seconds taken by all reduce tasks=64409600

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=177

​		CPU time spent (ms)=7310

​		Physical memory (bytes) snapshot=1136119808

​		Virtual memory (bytes) snapshot=59344662528

​		Total committed heap usage (bytes)=2267021312

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157147

17/04/21 10:15:46 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:15:46 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:15:47 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:15:47 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:15:47 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:15:47 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0026

17/04/21 10:15:47 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0026

17/04/21 10:15:47 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0026/

17/04/21 10:15:47 INFO mapreduce.Job: Running job: job_1492140941149_0026

17/04/21 10:15:54 INFO mapreduce.Job: Job job_1492140941149_0026 running in uber mode : false

17/04/21 10:15:54 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:15:59 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:16:05 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:16:09 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:16:09 INFO mapreduce.Job: Job job_1492140941149_0026 completed successfully

17/04/21 10:16:09 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319424

​		FILE: Number of bytes written=958425

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269038

​		HDFS: Number of bytes written=716517

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57650

​		Total time spent by all reduces in occupied slots (ms)=31410

​		Total time spent by all map tasks (ms)=5765

​		Total time spent by all reduce tasks (ms)=3141

​		Total vcore-seconds taken by all map tasks=11530

​		Total vcore-seconds taken by all reduce tasks=6282

​		Total megabyte-seconds taken by all map tasks=118067200

​		Total megabyte-seconds taken by all reduce tasks=64327680

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301638

​		Map output materialized bytes=319430

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319430

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=201

​		CPU time spent (ms)=6530

​		Physical memory (bytes) snapshot=1095487488

​		Virtual memory (bytes) snapshot=59342848000

​		Total committed heap usage (bytes)=2276458496

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716517

17/04/21 10:16:09 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:16:09 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:16:09 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:16:09 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:16:10 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:16:10 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0027

17/04/21 10:16:10 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0027

17/04/21 10:16:10 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0027/

17/04/21 10:16:10 INFO mapreduce.Job: Running job: job_1492140941149_0027

17/04/21 10:16:17 INFO mapreduce.Job: Job job_1492140941149_0027 running in uber mode : false

17/04/21 10:16:17 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:16:22 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:16:27 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:16:32 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:16:32 INFO mapreduce.Job: Job job_1492140941149_0027 completed successfully

17/04/21 10:16:32 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874189

​		HDFS: Number of bytes written=157580

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=61760

​		Total time spent by all reduces in occupied slots (ms)=31900

​		Total time spent by all map tasks (ms)=6176

​		Total time spent by all reduce tasks (ms)=3190

​		Total vcore-seconds taken by all map tasks=12352

​		Total vcore-seconds taken by all reduce tasks=6380

​		Total megabyte-seconds taken by all map tasks=126484480

​		Total megabyte-seconds taken by all reduce tasks=65331200

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=179

​		CPU time spent (ms)=7660

​		Physical memory (bytes) snapshot=1147658240

​		Virtual memory (bytes) snapshot=59355697152

​		Total committed heap usage (bytes)=2306342912

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157580

17/04/21 10:16:32 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:16:32 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:16:32 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:16:32 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:16:32 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:16:32 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0028

17/04/21 10:16:32 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0028

17/04/21 10:16:32 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0028/

17/04/21 10:16:32 INFO mapreduce.Job: Running job: job_1492140941149_0028

17/04/21 10:16:40 INFO mapreduce.Job: Job job_1492140941149_0028 running in uber mode : false

17/04/21 10:16:40 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:16:45 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:16:51 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:16:55 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:16:55 INFO mapreduce.Job: Job job_1492140941149_0028 completed successfully

17/04/21 10:16:55 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319857

​		FILE: Number of bytes written=959291

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269471

​		HDFS: Number of bytes written=714530

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57980

​		Total time spent by all reduces in occupied slots (ms)=31470

​		Total time spent by all map tasks (ms)=5798

​		Total time spent by all reduce tasks (ms)=3147

​		Total vcore-seconds taken by all map tasks=11596

​		Total vcore-seconds taken by all reduce tasks=6294

​		Total megabyte-seconds taken by all map tasks=118743040

​		Total megabyte-seconds taken by all reduce tasks=64450560

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302071

​		Map output materialized bytes=319863

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319863

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=193

​		CPU time spent (ms)=6480

​		Physical memory (bytes) snapshot=1124839424

​		Virtual memory (bytes) snapshot=59348529152

​		Total committed heap usage (bytes)=2315255808

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=714530

17/04/21 10:16:55 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:16:55 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:16:56 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:16:56 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:16:56 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:16:56 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0029

17/04/21 10:16:56 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0029

17/04/21 10:16:56 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0029/

17/04/21 10:16:56 INFO mapreduce.Job: Running job: job_1492140941149_0029

17/04/21 10:17:02 INFO mapreduce.Job: Job job_1492140941149_0029 running in uber mode : false

17/04/21 10:17:02 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:17:08 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:17:12 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:17:18 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:17:18 INFO mapreduce.Job: Job job_1492140941149_0029 completed successfully

17/04/21 10:17:18 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=872635

​		HDFS: Number of bytes written=156909

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=61880

​		Total time spent by all reduces in occupied slots (ms)=32080

​		Total time spent by all map tasks (ms)=6188

​		Total time spent by all reduce tasks (ms)=3208

​		Total vcore-seconds taken by all map tasks=12376

​		Total vcore-seconds taken by all reduce tasks=6416

​		Total megabyte-seconds taken by all map tasks=126730240

​		Total megabyte-seconds taken by all reduce tasks=65699840

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=195

​		CPU time spent (ms)=6970

​		Physical memory (bytes) snapshot=1141182464

​		Virtual memory (bytes) snapshot=59345575936

​		Total committed heap usage (bytes)=2268594176

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=156909

17/04/21 10:17:18 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:17:18 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:17:18 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:17:19 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:17:19 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:17:19 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0030

17/04/21 10:17:19 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0030

17/04/21 10:17:19 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0030/

17/04/21 10:17:19 INFO mapreduce.Job: Running job: job_1492140941149_0030

17/04/21 10:17:25 INFO mapreduce.Job: Job job_1492140941149_0030 running in uber mode : false

17/04/21 10:17:25 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:17:31 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:17:36 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:17:40 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:17:40 INFO mapreduce.Job: Job job_1492140941149_0030 completed successfully

17/04/21 10:17:40 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319186

​		FILE: Number of bytes written=957949

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=268800

​		HDFS: Number of bytes written=715638

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57940

​		Total time spent by all reduces in occupied slots (ms)=28870

​		Total time spent by all map tasks (ms)=5794

​		Total time spent by all reduce tasks (ms)=2887

​		Total vcore-seconds taken by all map tasks=11588

​		Total vcore-seconds taken by all reduce tasks=5774

​		Total megabyte-seconds taken by all map tasks=118661120

​		Total megabyte-seconds taken by all reduce tasks=59125760

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301400

​		Map output materialized bytes=319192

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319192

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=190

​		CPU time spent (ms)=6120

​		Physical memory (bytes) snapshot=1109426176

​		Virtual memory (bytes) snapshot=59342802944

​		Total committed heap usage (bytes)=2285895680

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=715638

17/04/21 10:17:40 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:17:40 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:17:40 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:17:40 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:17:41 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:17:41 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0031

17/04/21 10:17:41 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0031

17/04/21 10:17:41 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0031/

17/04/21 10:17:41 INFO mapreduce.Job: Running job: job_1492140941149_0031

17/04/21 10:17:47 INFO mapreduce.Job: Job job_1492140941149_0031 running in uber mode : false

17/04/21 10:17:47 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:17:52 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:17:57 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:18:02 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:18:02 INFO mapreduce.Job: Job job_1492140941149_0031 completed successfully

17/04/21 10:18:02 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=873072

​		HDFS: Number of bytes written=157369

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=61260

​		Total time spent by all reduces in occupied slots (ms)=31120

​		Total time spent by all map tasks (ms)=6126

​		Total time spent by all reduce tasks (ms)=3112

​		Total vcore-seconds taken by all map tasks=12252

​		Total vcore-seconds taken by all reduce tasks=6224

​		Total megabyte-seconds taken by all map tasks=125460480

​		Total megabyte-seconds taken by all reduce tasks=63733760

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=167

​		CPU time spent (ms)=7360

​		Physical memory (bytes) snapshot=1159622656

​		Virtual memory (bytes) snapshot=59353395200

​		Total committed heap usage (bytes)=2280652800

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157369

17/04/21 10:18:02 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:18:02 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:18:02 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:18:02 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:18:02 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:18:03 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0032

17/04/21 10:18:03 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0032

17/04/21 10:18:03 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0032/

17/04/21 10:18:03 INFO mapreduce.Job: Running job: job_1492140941149_0032

17/04/21 10:18:10 INFO mapreduce.Job: Job job_1492140941149_0032 running in uber mode : false

17/04/21 10:18:10 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:18:15 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:18:21 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:18:25 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:18:26 INFO mapreduce.Job: Job job_1492140941149_0032 completed successfully

17/04/21 10:18:26 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319646

​		FILE: Number of bytes written=958869

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269260

​		HDFS: Number of bytes written=714733

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=62330

​		Total time spent by all reduces in occupied slots (ms)=31760

​		Total time spent by all map tasks (ms)=6233

​		Total time spent by all reduce tasks (ms)=3176

​		Total vcore-seconds taken by all map tasks=12466

​		Total vcore-seconds taken by all reduce tasks=6352

​		Total megabyte-seconds taken by all map tasks=127651840

​		Total megabyte-seconds taken by all reduce tasks=65044480

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301860

​		Map output materialized bytes=319652

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319652

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=186

​		CPU time spent (ms)=6460

​		Physical memory (bytes) snapshot=1123618816

​		Virtual memory (bytes) snapshot=59348307968

​		Total committed heap usage (bytes)=2325741568

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=714733

17/04/21 10:18:26 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:18:26 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:18:26 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:18:26 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:18:26 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:18:26 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0033

17/04/21 10:18:26 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0033

17/04/21 10:18:26 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0033/

17/04/21 10:18:26 INFO mapreduce.Job: Running job: job_1492140941149_0033

17/04/21 10:18:33 INFO mapreduce.Job: Job job_1492140941149_0033 running in uber mode : false

17/04/21 10:18:33 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:18:38 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:18:43 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:18:47 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:18:48 INFO mapreduce.Job: Job job_1492140941149_0033 completed successfully

17/04/21 10:18:48 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=872627

​		HDFS: Number of bytes written=157296

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=59780

​		Total time spent by all reduces in occupied slots (ms)=31830

​		Total time spent by all map tasks (ms)=5978

​		Total time spent by all reduce tasks (ms)=3183

​		Total vcore-seconds taken by all map tasks=11956

​		Total vcore-seconds taken by all reduce tasks=6366

​		Total megabyte-seconds taken by all map tasks=122429440

​		Total megabyte-seconds taken by all reduce tasks=65187840

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=177

​		CPU time spent (ms)=7250

​		Physical memory (bytes) snapshot=1150087168

​		Virtual memory (bytes) snapshot=59346272256

​		Total committed heap usage (bytes)=2271739904

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157296

17/04/21 10:18:48 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:18:48 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:18:48 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:18:48 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:18:48 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:18:48 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0034

17/04/21 10:18:48 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0034

17/04/21 10:18:48 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0034/

17/04/21 10:18:48 INFO mapreduce.Job: Running job: job_1492140941149_0034

17/04/21 10:18:54 INFO mapreduce.Job: Job job_1492140941149_0034 running in uber mode : false

17/04/21 10:18:54 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:19:00 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:19:06 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:19:11 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:19:11 INFO mapreduce.Job: Job job_1492140941149_0034 completed successfully

17/04/21 10:19:11 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319573

​		FILE: Number of bytes written=958723

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269187

​		HDFS: Number of bytes written=714973

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58600

​		Total time spent by all reduces in occupied slots (ms)=32110

​		Total time spent by all map tasks (ms)=5860

​		Total time spent by all reduce tasks (ms)=3211

​		Total vcore-seconds taken by all map tasks=11720

​		Total vcore-seconds taken by all reduce tasks=6422

​		Total megabyte-seconds taken by all map tasks=120012800

​		Total megabyte-seconds taken by all reduce tasks=65761280

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301787

​		Map output materialized bytes=319579

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319579

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=192

​		CPU time spent (ms)=6290

​		Physical memory (bytes) snapshot=1109168128

​		Virtual memory (bytes) snapshot=59350278144

​		Total committed heap usage (bytes)=2293760000

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=714973

17/04/21 10:19:11 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:19:11 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:19:11 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:19:11 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:19:11 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:19:11 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0035

17/04/21 10:19:11 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0035

17/04/21 10:19:11 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0035/

17/04/21 10:19:11 INFO mapreduce.Job: Running job: job_1492140941149_0035

17/04/21 10:19:19 INFO mapreduce.Job: Job job_1492140941149_0035 running in uber mode : false

17/04/21 10:19:19 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:19:24 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:19:29 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:19:33 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:19:33 INFO mapreduce.Job: Job job_1492140941149_0035 completed successfully

17/04/21 10:19:33 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=872794

​		HDFS: Number of bytes written=157398

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60810

​		Total time spent by all reduces in occupied slots (ms)=31360

​		Total time spent by all map tasks (ms)=6081

​		Total time spent by all reduce tasks (ms)=3136

​		Total vcore-seconds taken by all map tasks=12162

​		Total vcore-seconds taken by all reduce tasks=6272

​		Total megabyte-seconds taken by all map tasks=124538880

​		Total megabyte-seconds taken by all reduce tasks=64225280

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=190

​		CPU time spent (ms)=7280

​		Physical memory (bytes) snapshot=1163689984

​		Virtual memory (bytes) snapshot=59351715840

​		Total committed heap usage (bytes)=2286419968

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157398

17/04/21 10:19:34 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:19:34 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:19:34 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:19:34 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:19:34 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:19:34 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0036

17/04/21 10:19:34 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0036

17/04/21 10:19:34 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0036/

17/04/21 10:19:34 INFO mapreduce.Job: Running job: job_1492140941149_0036

17/04/21 10:19:41 INFO mapreduce.Job: Job job_1492140941149_0036 running in uber mode : false

17/04/21 10:19:41 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:19:46 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:19:52 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:19:56 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:19:56 INFO mapreduce.Job: Job job_1492140941149_0036 completed successfully

17/04/21 10:19:56 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319675

​		FILE: Number of bytes written=958927

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269289

​		HDFS: Number of bytes written=714280

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58210

​		Total time spent by all reduces in occupied slots (ms)=31050

​		Total time spent by all map tasks (ms)=5821

​		Total time spent by all reduce tasks (ms)=3105

​		Total vcore-seconds taken by all map tasks=11642

​		Total vcore-seconds taken by all reduce tasks=6210

​		Total megabyte-seconds taken by all map tasks=119214080

​		Total megabyte-seconds taken by all reduce tasks=63590400

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301889

​		Map output materialized bytes=319681

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319681

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=182

​		CPU time spent (ms)=6170

​		Physical memory (bytes) snapshot=1117855744

​		Virtual memory (bytes) snapshot=59345735680

​		Total committed heap usage (bytes)=2328887296

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=714280

17/04/21 10:19:56 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:19:56 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:19:57 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:19:57 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:19:57 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:19:57 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0037

17/04/21 10:19:57 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0037

17/04/21 10:19:57 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0037/

17/04/21 10:19:57 INFO mapreduce.Job: Running job: job_1492140941149_0037

17/04/21 10:20:05 INFO mapreduce.Job: Job job_1492140941149_0037 running in uber mode : false

17/04/21 10:20:05 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:20:10 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:20:15 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:20:19 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:20:19 INFO mapreduce.Job: Job job_1492140941149_0037 completed successfully

17/04/21 10:20:19 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=872203

​		HDFS: Number of bytes written=157258

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=66070

​		Total time spent by all reduces in occupied slots (ms)=31490

​		Total time spent by all map tasks (ms)=6607

​		Total time spent by all reduce tasks (ms)=3149

​		Total vcore-seconds taken by all map tasks=13214

​		Total vcore-seconds taken by all reduce tasks=6298

​		Total megabyte-seconds taken by all map tasks=135311360

​		Total megabyte-seconds taken by all reduce tasks=64491520

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=183

​		CPU time spent (ms)=7310

​		Physical memory (bytes) snapshot=1153638400

​		Virtual memory (bytes) snapshot=59350847488

​		Total committed heap usage (bytes)=2304770048

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157258

17/04/21 10:20:19 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:20:19 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:20:19 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:20:19 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:20:19 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:20:19 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0038

17/04/21 10:20:19 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0038

17/04/21 10:20:19 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0038/

17/04/21 10:20:19 INFO mapreduce.Job: Running job: job_1492140941149_0038

17/04/21 10:20:27 INFO mapreduce.Job: Job job_1492140941149_0038 running in uber mode : false

17/04/21 10:20:27 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:20:32 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:20:38 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:20:42 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:20:42 INFO mapreduce.Job: Job job_1492140941149_0038 completed successfully

17/04/21 10:20:42 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319535

​		FILE: Number of bytes written=958647

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269149

​		HDFS: Number of bytes written=714732

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57800

​		Total time spent by all reduces in occupied slots (ms)=31620

​		Total time spent by all map tasks (ms)=5780

​		Total time spent by all reduce tasks (ms)=3162

​		Total vcore-seconds taken by all map tasks=11560

​		Total vcore-seconds taken by all reduce tasks=6324

​		Total megabyte-seconds taken by all map tasks=118374400

​		Total megabyte-seconds taken by all reduce tasks=64757760

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301749

​		Map output materialized bytes=319541

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319541

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=189

​		CPU time spent (ms)=6470

​		Physical memory (bytes) snapshot=1124900864

​		Virtual memory (bytes) snapshot=59343847424

​		Total committed heap usage (bytes)=2303721472

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=714732

17/04/21 10:20:42 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:20:42 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:20:42 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:20:42 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:20:42 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:20:42 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0039

17/04/21 10:20:42 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0039

17/04/21 10:20:42 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0039/

17/04/21 10:20:42 INFO mapreduce.Job: Running job: job_1492140941149_0039

17/04/21 10:20:48 INFO mapreduce.Job: Job job_1492140941149_0039 running in uber mode : false

17/04/21 10:20:48 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:20:54 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:20:58 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:21:04 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:21:04 INFO mapreduce.Job: Job job_1492140941149_0039 completed successfully

17/04/21 10:21:04 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677142

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=872515

​		HDFS: Number of bytes written=157070

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=61090

​		Total time spent by all reduces in occupied slots (ms)=31850

​		Total time spent by all map tasks (ms)=6109

​		Total time spent by all reduce tasks (ms)=3185

​		Total vcore-seconds taken by all map tasks=12218

​		Total vcore-seconds taken by all reduce tasks=6370

​		Total megabyte-seconds taken by all map tasks=125112320

​		Total megabyte-seconds taken by all reduce tasks=65228800

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=176

​		CPU time spent (ms)=7280

​		Physical memory (bytes) snapshot=1164832768

​		Virtual memory (bytes) snapshot=59353026560

​		Total committed heap usage (bytes)=2291662848

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157070

17/04/21 10:21:04 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:21:04 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:21:04 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:21:04 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:21:04 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:21:04 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0040

17/04/21 10:21:04 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0040

17/04/21 10:21:04 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0040/

17/04/21 10:21:04 INFO mapreduce.Job: Running job: job_1492140941149_0040

17/04/21 10:21:11 INFO mapreduce.Job: Job job_1492140941149_0040 running in uber mode : false

17/04/21 10:21:11 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:21:16 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:21:22 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:21:26 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:21:26 INFO mapreduce.Job: Job job_1492140941149_0040 completed successfully

17/04/21 10:21:26 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319347

​		FILE: Number of bytes written=958271

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=268961

​		HDFS: Number of bytes written=716530

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=62670

​		Total time spent by all reduces in occupied slots (ms)=31750

​		Total time spent by all map tasks (ms)=6267

​		Total time spent by all reduce tasks (ms)=3175

​		Total vcore-seconds taken by all map tasks=12534

​		Total vcore-seconds taken by all reduce tasks=6350

​		Total megabyte-seconds taken by all map tasks=128348160

​		Total megabyte-seconds taken by all reduce tasks=65024000

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301561

​		Map output materialized bytes=319353

​		Input split bytes=534

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319353

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=177

​		CPU time spent (ms)=6580

​		Physical memory (bytes) snapshot=1119985664

​		Virtual memory (bytes) snapshot=59353751552

​		Total committed heap usage (bytes)=2308440064

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716530

17/04/21 10:21:26 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:21:26 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:21:27 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:21:27 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:21:27 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:21:27 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0041

17/04/21 10:21:27 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0041

17/04/21 10:21:27 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0041/

17/04/21 10:21:27 INFO mapreduce.Job: Running job: job_1492140941149_0041

17/04/21 10:21:34 INFO mapreduce.Job: Job job_1492140941149_0041 running in uber mode : false

17/04/21 10:21:34 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:21:39 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:21:44 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:21:48 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:21:49 INFO mapreduce.Job: Job job_1492140941149_0041 completed successfully

17/04/21 10:21:49 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677145

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874125

​		HDFS: Number of bytes written=157437

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60640

​		Total time spent by all reduces in occupied slots (ms)=32270

​		Total time spent by all map tasks (ms)=6064

​		Total time spent by all reduce tasks (ms)=3227

​		Total vcore-seconds taken by all map tasks=12128

​		Total vcore-seconds taken by all reduce tasks=6454

​		Total megabyte-seconds taken by all map tasks=124190720

​		Total megabyte-seconds taken by all reduce tasks=66088960

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=525

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=182

​		CPU time spent (ms)=7550

​		Physical memory (bytes) snapshot=1167314944

​		Virtual memory (bytes) snapshot=59351105536

​		Total committed heap usage (bytes)=2261778432

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157437

17/04/21 10:21:49 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:21:49 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:21:50 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:21:50 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:21:50 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:21:50 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0042

17/04/21 10:21:50 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0042

17/04/21 10:21:50 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0042/

17/04/21 10:21:50 INFO mapreduce.Job: Running job: job_1492140941149_0042

17/04/21 10:21:56 INFO mapreduce.Job: Job job_1492140941149_0042 running in uber mode : false

17/04/21 10:21:56 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:22:01 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:22:07 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:22:12 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:22:12 INFO mapreduce.Job: Job job_1492140941149_0042 completed successfully

17/04/21 10:22:12 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319714

​		FILE: Number of bytes written=959014

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269329

​		HDFS: Number of bytes written=716567

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58340

​		Total time spent by all reduces in occupied slots (ms)=32870

​		Total time spent by all map tasks (ms)=5834

​		Total time spent by all reduce tasks (ms)=3287

​		Total vcore-seconds taken by all map tasks=11668

​		Total vcore-seconds taken by all reduce tasks=6574

​		Total megabyte-seconds taken by all map tasks=119480320

​		Total megabyte-seconds taken by all reduce tasks=67317760

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301928

​		Map output materialized bytes=319720

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319720

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=175

​		CPU time spent (ms)=6850

​		Physical memory (bytes) snapshot=1124728832

​		Virtual memory (bytes) snapshot=59348017152

​		Total committed heap usage (bytes)=2270167040

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716567

17/04/21 10:22:12 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:22:12 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:22:13 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:22:13 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:22:13 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:22:13 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0043

17/04/21 10:22:13 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0043

17/04/21 10:22:13 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0043/

17/04/21 10:22:13 INFO mapreduce.Job: Running job: job_1492140941149_0043

17/04/21 10:22:20 INFO mapreduce.Job: Job job_1492140941149_0043 running in uber mode : false

17/04/21 10:22:20 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:22:25 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:22:30 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:22:34 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:22:35 INFO mapreduce.Job: Job job_1492140941149_0043 completed successfully

17/04/21 10:22:35 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874531

​		HDFS: Number of bytes written=157421

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60820

​		Total time spent by all reduces in occupied slots (ms)=33310

​		Total time spent by all map tasks (ms)=6082

​		Total time spent by all reduce tasks (ms)=3331

​		Total vcore-seconds taken by all map tasks=12164

​		Total vcore-seconds taken by all reduce tasks=6662

​		Total megabyte-seconds taken by all map tasks=124559360

​		Total megabyte-seconds taken by all reduce tasks=68218880

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=198

​		CPU time spent (ms)=7530

​		Physical memory (bytes) snapshot=1160826880

​		Virtual memory (bytes) snapshot=59350462464

​		Total committed heap usage (bytes)=2327314432

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157421

17/04/21 10:22:35 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:22:35 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:22:35 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:22:35 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:22:36 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:22:36 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0044

17/04/21 10:22:36 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0044

17/04/21 10:22:36 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0044/

17/04/21 10:22:36 INFO mapreduce.Job: Running job: job_1492140941149_0044

17/04/21 10:22:42 INFO mapreduce.Job: Job job_1492140941149_0044 running in uber mode : false

17/04/21 10:22:42 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:22:48 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:22:54 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:22:58 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:22:58 INFO mapreduce.Job: Job job_1492140941149_0044 completed successfully

17/04/21 10:22:58 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319698

​		FILE: Number of bytes written=958982

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269313

​		HDFS: Number of bytes written=716840

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57910

​		Total time spent by all reduces in occupied slots (ms)=31760

​		Total time spent by all map tasks (ms)=5791

​		Total time spent by all reduce tasks (ms)=3176

​		Total vcore-seconds taken by all map tasks=11582

​		Total vcore-seconds taken by all reduce tasks=6352

​		Total megabyte-seconds taken by all map tasks=118599680

​		Total megabyte-seconds taken by all reduce tasks=65044480

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=301912

​		Map output materialized bytes=319704

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319704

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=180

​		CPU time spent (ms)=6650

​		Physical memory (bytes) snapshot=1118928896

​		Virtual memory (bytes) snapshot=59344351232

​		Total committed heap usage (bytes)=2286419968

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716840

17/04/21 10:22:58 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:22:58 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:22:58 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:22:58 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:22:58 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:22:58 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0045

17/04/21 10:22:58 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0045

17/04/21 10:22:58 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0045/

17/04/21 10:22:58 INFO mapreduce.Job: Running job: job_1492140941149_0045

17/04/21 10:23:06 INFO mapreduce.Job: Job job_1492140941149_0045 running in uber mode : false

17/04/21 10:23:06 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:23:11 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:23:16 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:23:20 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:23:20 INFO mapreduce.Job: Job job_1492140941149_0045 completed successfully

17/04/21 10:23:20 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874788

​		HDFS: Number of bytes written=157571

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60380

​		Total time spent by all reduces in occupied slots (ms)=29530

​		Total time spent by all map tasks (ms)=6038

​		Total time spent by all reduce tasks (ms)=2953

​		Total vcore-seconds taken by all map tasks=12076

​		Total vcore-seconds taken by all reduce tasks=5906

​		Total megabyte-seconds taken by all map tasks=123658240

​		Total megabyte-seconds taken by all reduce tasks=60477440

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=171

​		CPU time spent (ms)=7490

​		Physical memory (bytes) snapshot=1170223104

​		Virtual memory (bytes) snapshot=59359260672

​		Total committed heap usage (bytes)=2269642752

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157571

17/04/21 10:23:20 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:23:20 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:23:20 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:23:20 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:23:20 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:23:20 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0046

17/04/21 10:23:20 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0046

17/04/21 10:23:20 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0046/

17/04/21 10:23:20 INFO mapreduce.Job: Running job: job_1492140941149_0046

17/04/21 10:23:27 INFO mapreduce.Job: Job job_1492140941149_0046 running in uber mode : false

17/04/21 10:23:27 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:23:32 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:23:38 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:23:43 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:23:44 INFO mapreduce.Job: Job job_1492140941149_0046 completed successfully

17/04/21 10:23:44 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=319848

​		FILE: Number of bytes written=959282

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269463

​		HDFS: Number of bytes written=716586

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58540

​		Total time spent by all reduces in occupied slots (ms)=33390

​		Total time spent by all map tasks (ms)=5854

​		Total time spent by all reduce tasks (ms)=3339

​		Total vcore-seconds taken by all map tasks=11708

​		Total vcore-seconds taken by all reduce tasks=6678

​		Total megabyte-seconds taken by all map tasks=119889920

​		Total megabyte-seconds taken by all reduce tasks=68382720

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302062

​		Map output materialized bytes=319854

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=319854

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=193

​		CPU time spent (ms)=6810

​		Physical memory (bytes) snapshot=1122246656

​		Virtual memory (bytes) snapshot=59346210816

​		Total committed heap usage (bytes)=2333605888

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716586

17/04/21 10:23:44 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:23:44 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:23:45 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:23:45 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:23:45 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:23:45 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0047

17/04/21 10:23:45 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0047

17/04/21 10:23:45 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0047/

17/04/21 10:23:45 INFO mapreduce.Job: Running job: job_1492140941149_0047

17/04/21 10:23:52 INFO mapreduce.Job: Job job_1492140941149_0047 running in uber mode : false

17/04/21 10:23:52 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:23:57 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:24:02 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:24:06 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:24:06 INFO mapreduce.Job: Job job_1492140941149_0047 completed successfully

17/04/21 10:24:06 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874684

​		HDFS: Number of bytes written=157888

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60780

​		Total time spent by all reduces in occupied slots (ms)=31520

​		Total time spent by all map tasks (ms)=6078

​		Total time spent by all reduce tasks (ms)=3152

​		Total vcore-seconds taken by all map tasks=12156

​		Total vcore-seconds taken by all reduce tasks=6304

​		Total megabyte-seconds taken by all map tasks=124477440

​		Total megabyte-seconds taken by all reduce tasks=64552960

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=169

​		CPU time spent (ms)=7740

​		Physical memory (bytes) snapshot=1159135232

​		Virtual memory (bytes) snapshot=59344793600

​		Total committed heap usage (bytes)=2283274240

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157888

17/04/21 10:24:06 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:24:06 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:24:06 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:24:06 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:24:06 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:24:07 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0048

17/04/21 10:24:07 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0048

17/04/21 10:24:07 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0048/

17/04/21 10:24:07 INFO mapreduce.Job: Running job: job_1492140941149_0048

17/04/21 10:24:14 INFO mapreduce.Job: Job job_1492140941149_0048 running in uber mode : false

17/04/21 10:24:14 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:24:19 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:24:25 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:24:29 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:24:30 INFO mapreduce.Job: Job job_1492140941149_0048 completed successfully

17/04/21 10:24:30 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=320165

​		FILE: Number of bytes written=959916

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269780

​		HDFS: Number of bytes written=716440

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58000

​		Total time spent by all reduces in occupied slots (ms)=31130

​		Total time spent by all map tasks (ms)=5800

​		Total time spent by all reduce tasks (ms)=3113

​		Total vcore-seconds taken by all map tasks=11600

​		Total vcore-seconds taken by all reduce tasks=6226

​		Total megabyte-seconds taken by all map tasks=118784000

​		Total megabyte-seconds taken by all reduce tasks=63754240

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302379

​		Map output materialized bytes=320171

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=320171

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=179

​		CPU time spent (ms)=6290

​		Physical memory (bytes) snapshot=1114636288

​		Virtual memory (bytes) snapshot=59345883136

​		Total committed heap usage (bytes)=2304245760

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716440

17/04/21 10:24:30 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:24:30 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:24:30 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:24:30 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:24:30 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:24:30 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0049

17/04/21 10:24:30 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0049

17/04/21 10:24:30 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0049/

17/04/21 10:24:30 INFO mapreduce.Job: Running job: job_1492140941149_0049

17/04/21 10:24:36 INFO mapreduce.Job: Job job_1492140941149_0049 running in uber mode : false

17/04/21 10:24:36 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:24:43 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:24:47 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:24:51 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:24:52 INFO mapreduce.Job: Job job_1492140941149_0049 completed successfully

17/04/21 10:24:52 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874855

​		HDFS: Number of bytes written=158025

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=61370

​		Total time spent by all reduces in occupied slots (ms)=32050

​		Total time spent by all map tasks (ms)=6137

​		Total time spent by all reduce tasks (ms)=3205

​		Total vcore-seconds taken by all map tasks=12274

​		Total vcore-seconds taken by all reduce tasks=6410

​		Total megabyte-seconds taken by all map tasks=125685760

​		Total megabyte-seconds taken by all reduce tasks=65638400

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=202

​		CPU time spent (ms)=8180

​		Physical memory (bytes) snapshot=1165832192

​		Virtual memory (bytes) snapshot=59350540288

​		Total committed heap usage (bytes)=2264924160

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=158025

17/04/21 10:24:52 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:24:52 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:24:52 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:24:52 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:24:52 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:24:52 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0050

17/04/21 10:24:52 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0050

17/04/21 10:24:52 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0050/

17/04/21 10:24:52 INFO mapreduce.Job: Running job: job_1492140941149_0050

17/04/21 10:24:59 INFO mapreduce.Job: Job job_1492140941149_0050 running in uber mode : false

17/04/21 10:24:59 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:25:05 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:25:11 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:25:15 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:25:15 INFO mapreduce.Job: Job job_1492140941149_0050 completed successfully

17/04/21 10:25:15 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=320302

​		FILE: Number of bytes written=960190

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269917

​		HDFS: Number of bytes written=717364

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58770

​		Total time spent by all reduces in occupied slots (ms)=31970

​		Total time spent by all map tasks (ms)=5877

​		Total time spent by all reduce tasks (ms)=3197

​		Total vcore-seconds taken by all map tasks=11754

​		Total vcore-seconds taken by all reduce tasks=6394

​		Total megabyte-seconds taken by all map tasks=120360960

​		Total megabyte-seconds taken by all reduce tasks=65474560

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302516

​		Map output materialized bytes=320308

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=320308

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=210

​		CPU time spent (ms)=6330

​		Physical memory (bytes) snapshot=1118580736

​		Virtual memory (bytes) snapshot=59350851584

​		Total committed heap usage (bytes)=2272788480

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=717364

17/04/21 10:25:15 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:25:15 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:25:15 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:25:15 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:25:15 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:25:15 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0051

17/04/21 10:25:15 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0051

17/04/21 10:25:15 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0051/

17/04/21 10:25:15 INFO mapreduce.Job: Running job: job_1492140941149_0051

17/04/21 10:25:22 INFO mapreduce.Job: Job job_1492140941149_0051 running in uber mode : false

17/04/21 10:25:22 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:25:27 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:25:32 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:25:36 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:25:36 INFO mapreduce.Job: Job job_1492140941149_0051 completed successfully

17/04/21 10:25:36 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=875916

​		HDFS: Number of bytes written=157829

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=59680

​		Total time spent by all reduces in occupied slots (ms)=31480

​		Total time spent by all map tasks (ms)=5968

​		Total time spent by all reduce tasks (ms)=3148

​		Total vcore-seconds taken by all map tasks=11936

​		Total vcore-seconds taken by all reduce tasks=6296

​		Total megabyte-seconds taken by all map tasks=122224640

​		Total megabyte-seconds taken by all reduce tasks=64471040

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=166

​		CPU time spent (ms)=7660

​		Physical memory (bytes) snapshot=1166204928

​		Virtual memory (bytes) snapshot=59356401664

​		Total committed heap usage (bytes)=2281701376

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=157829

17/04/21 10:25:37 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:25:37 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:25:37 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:25:37 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:25:37 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:25:37 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0052

17/04/21 10:25:37 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0052

17/04/21 10:25:37 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0052/

17/04/21 10:25:37 INFO mapreduce.Job: Running job: job_1492140941149_0052

17/04/21 10:25:44 INFO mapreduce.Job: Job job_1492140941149_0052 running in uber mode : false

17/04/21 10:25:44 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:25:49 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:25:55 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:25:59 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:26:00 INFO mapreduce.Job: Job job_1492140941149_0052 completed successfully

17/04/21 10:26:00 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=320106

​		FILE: Number of bytes written=959798

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=269721

​		HDFS: Number of bytes written=716573

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57650

​		Total time spent by all reduces in occupied slots (ms)=31710

​		Total time spent by all map tasks (ms)=5765

​		Total time spent by all reduce tasks (ms)=3171

​		Total vcore-seconds taken by all map tasks=11530

​		Total vcore-seconds taken by all reduce tasks=6342

​		Total megabyte-seconds taken by all map tasks=118067200

​		Total megabyte-seconds taken by all reduce tasks=64942080

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302320

​		Map output materialized bytes=320112

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=320112

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=183

​		CPU time spent (ms)=6510

​		Physical memory (bytes) snapshot=1121284096

​		Virtual memory (bytes) snapshot=59350933504

​		Total committed heap usage (bytes)=2269118464

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716573

17/04/21 10:26:00 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:26:00 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:26:01 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:26:01 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:26:01 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:26:01 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0053

17/04/21 10:26:01 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0053

17/04/21 10:26:01 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0053/

17/04/21 10:26:01 INFO mapreduce.Job: Running job: job_1492140941149_0053

17/04/21 10:26:08 INFO mapreduce.Job: Job job_1492140941149_0053 running in uber mode : false

17/04/21 10:26:08 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:26:13 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:26:18 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:26:22 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:26:22 INFO mapreduce.Job: Job job_1492140941149_0053 completed successfully

17/04/21 10:26:22 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=874929

​		HDFS: Number of bytes written=158366

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=61530

​		Total time spent by all reduces in occupied slots (ms)=33170

​		Total time spent by all map tasks (ms)=6153

​		Total time spent by all reduce tasks (ms)=3317

​		Total vcore-seconds taken by all map tasks=12306

​		Total vcore-seconds taken by all reduce tasks=6634

​		Total megabyte-seconds taken by all map tasks=126013440

​		Total megabyte-seconds taken by all reduce tasks=67932160

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=172

​		CPU time spent (ms)=7290

​		Physical memory (bytes) snapshot=1160085504

​		Virtual memory (bytes) snapshot=59350777856

​		Total committed heap usage (bytes)=2296905728

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=158366

17/04/21 10:26:22 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:26:22 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:26:23 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:26:23 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:26:23 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:26:23 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0054

17/04/21 10:26:23 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0054

17/04/21 10:26:23 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0054/

17/04/21 10:26:23 INFO mapreduce.Job: Running job: job_1492140941149_0054

17/04/21 10:26:30 INFO mapreduce.Job: Job job_1492140941149_0054 running in uber mode : false

17/04/21 10:26:30 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:26:35 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:26:40 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:26:45 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:26:45 INFO mapreduce.Job: Job job_1492140941149_0054 completed successfully

17/04/21 10:26:45 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=320643

​		FILE: Number of bytes written=960872

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=270258

​		HDFS: Number of bytes written=716862

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58460

​		Total time spent by all reduces in occupied slots (ms)=31410

​		Total time spent by all map tasks (ms)=5846

​		Total time spent by all reduce tasks (ms)=3141

​		Total vcore-seconds taken by all map tasks=11692

​		Total vcore-seconds taken by all reduce tasks=6282

​		Total megabyte-seconds taken by all map tasks=119726080

​		Total megabyte-seconds taken by all reduce tasks=64327680

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302857

​		Map output materialized bytes=320649

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=320649

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=207

​		CPU time spent (ms)=6780

​		Physical memory (bytes) snapshot=1116368896

​		Virtual memory (bytes) snapshot=59344642048

​		Total committed heap usage (bytes)=2291662848

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716862

17/04/21 10:26:45 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:26:45 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:26:46 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:26:46 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:26:46 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:26:46 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0055

17/04/21 10:26:46 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0055

17/04/21 10:26:46 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0055/

17/04/21 10:26:46 INFO mapreduce.Job: Running job: job_1492140941149_0055

17/04/21 10:26:53 INFO mapreduce.Job: Job job_1492140941149_0055 running in uber mode : false

17/04/21 10:26:53 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:26:58 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:27:03 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:27:08 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:27:08 INFO mapreduce.Job: Job job_1492140941149_0055 completed successfully

17/04/21 10:27:08 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=875755

​		HDFS: Number of bytes written=158275

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60860

​		Total time spent by all reduces in occupied slots (ms)=31620

​		Total time spent by all map tasks (ms)=6086

​		Total time spent by all reduce tasks (ms)=3162

​		Total vcore-seconds taken by all map tasks=12172

​		Total vcore-seconds taken by all reduce tasks=6324

​		Total megabyte-seconds taken by all map tasks=124641280

​		Total megabyte-seconds taken by all reduce tasks=64757760

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=172

​		CPU time spent (ms)=7260

​		Physical memory (bytes) snapshot=1155248128

​		Virtual memory (bytes) snapshot=59348504576

​		Total committed heap usage (bytes)=2293235712

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=158275

17/04/21 10:27:08 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:27:08 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:27:08 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:27:08 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:27:09 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:27:09 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0056

17/04/21 10:27:09 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0056

17/04/21 10:27:09 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0056/

17/04/21 10:27:09 INFO mapreduce.Job: Running job: job_1492140941149_0056

17/04/21 10:27:15 INFO mapreduce.Job: Job job_1492140941149_0056 running in uber mode : false

17/04/21 10:27:15 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:27:21 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:27:26 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:27:30 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:27:31 INFO mapreduce.Job: Job job_1492140941149_0056 completed successfully

17/04/21 10:27:31 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=320552

​		FILE: Number of bytes written=960690

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=270167

​		HDFS: Number of bytes written=716796

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=61030

​		Total time spent by all reduces in occupied slots (ms)=31380

​		Total time spent by all map tasks (ms)=6103

​		Total time spent by all reduce tasks (ms)=3138

​		Total vcore-seconds taken by all map tasks=12206

​		Total vcore-seconds taken by all reduce tasks=6276

​		Total megabyte-seconds taken by all map tasks=124989440

​		Total megabyte-seconds taken by all reduce tasks=64266240

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302766

​		Map output materialized bytes=320558

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=320558

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=180

​		CPU time spent (ms)=6720

​		Physical memory (bytes) snapshot=1115340800

​		Virtual memory (bytes) snapshot=59357007872

​		Total committed heap usage (bytes)=2265972736

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=716796

17/04/21 10:27:31 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:27:31 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:27:31 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:27:31 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:27:31 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:27:31 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0057

17/04/21 10:27:31 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0057

17/04/21 10:27:31 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0057/

17/04/21 10:27:31 INFO mapreduce.Job: Running job: job_1492140941149_0057

17/04/21 10:27:39 INFO mapreduce.Job: Job job_1492140941149_0057 running in uber mode : false

17/04/21 10:27:39 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:27:44 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:27:49 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:27:53 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:27:53 INFO mapreduce.Job: Job job_1492140941149_0057 completed successfully

17/04/21 10:27:53 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=875598

​		HDFS: Number of bytes written=158472

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60380

​		Total time spent by all reduces in occupied slots (ms)=31520

​		Total time spent by all map tasks (ms)=6038

​		Total time spent by all reduce tasks (ms)=3152

​		Total vcore-seconds taken by all map tasks=12076

​		Total vcore-seconds taken by all reduce tasks=6304

​		Total megabyte-seconds taken by all map tasks=123658240

​		Total megabyte-seconds taken by all reduce tasks=64552960

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=168

​		CPU time spent (ms)=7490

​		Physical memory (bytes) snapshot=1157869568

​		Virtual memory (bytes) snapshot=59347382272

​		Total committed heap usage (bytes)=2294808576

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=158472

17/04/21 10:27:53 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:27:53 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:27:53 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:27:53 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:27:53 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:27:53 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0058

17/04/21 10:27:53 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0058

17/04/21 10:27:53 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0058/

17/04/21 10:27:53 INFO mapreduce.Job: Running job: job_1492140941149_0058

17/04/21 10:28:00 INFO mapreduce.Job: Job job_1492140941149_0058 running in uber mode : false

17/04/21 10:28:00 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:28:06 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:28:12 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:28:16 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:28:16 INFO mapreduce.Job: Job job_1492140941149_0058 completed successfully

17/04/21 10:28:16 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=320749

​		FILE: Number of bytes written=961084

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=270364

​		HDFS: Number of bytes written=717594

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=58260

​		Total time spent by all reduces in occupied slots (ms)=31380

​		Total time spent by all map tasks (ms)=5826

​		Total time spent by all reduce tasks (ms)=3138

​		Total vcore-seconds taken by all map tasks=11652

​		Total vcore-seconds taken by all reduce tasks=6276

​		Total megabyte-seconds taken by all map tasks=119316480

​		Total megabyte-seconds taken by all reduce tasks=64266240

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=302963

​		Map output materialized bytes=320755

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=320755

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=187

​		CPU time spent (ms)=6710

​		Physical memory (bytes) snapshot=1122725888

​		Virtual memory (bytes) snapshot=59350904832

​		Total committed heap usage (bytes)=2269118464

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=717594

17/04/21 10:28:16 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:28:16 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:28:16 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:28:16 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:28:16 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:28:16 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0059

17/04/21 10:28:16 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0059

17/04/21 10:28:16 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0059/

17/04/21 10:28:16 INFO mapreduce.Job: Running job: job_1492140941149_0059

17/04/21 10:28:23 INFO mapreduce.Job: Job job_1492140941149_0059 running in uber mode : false

17/04/21 10:28:23 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:28:28 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:28:33 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:28:37 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:28:37 INFO mapreduce.Job: Job job_1492140941149_0059 completed successfully

17/04/21 10:28:37 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=876593

​		HDFS: Number of bytes written=158650

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60640

​		Total time spent by all reduces in occupied slots (ms)=31360

​		Total time spent by all map tasks (ms)=6064

​		Total time spent by all reduce tasks (ms)=3136

​		Total vcore-seconds taken by all map tasks=12128

​		Total vcore-seconds taken by all reduce tasks=6272

​		Total megabyte-seconds taken by all map tasks=124190720

​		Total megabyte-seconds taken by all reduce tasks=64225280

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=178

​		CPU time spent (ms)=7400

​		Physical memory (bytes) snapshot=1162633216

​		Virtual memory (bytes) snapshot=59350921216

​		Total committed heap usage (bytes)=2289565696

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=158650

17/04/21 10:28:38 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:28:38 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:28:38 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:28:38 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:28:38 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:28:38 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0060

17/04/21 10:28:38 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0060

17/04/21 10:28:38 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0060/

17/04/21 10:28:38 INFO mapreduce.Job: Running job: job_1492140941149_0060

17/04/21 10:28:45 INFO mapreduce.Job: Job job_1492140941149_0060 running in uber mode : false

17/04/21 10:28:45 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:28:50 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:28:56 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:29:00 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:29:01 INFO mapreduce.Job: Job job_1492140941149_0060 completed successfully

17/04/21 10:29:01 INFO mapreduce.Job: Counters: 50

​	File System Counters

​		FILE: Number of bytes read=320927

​		FILE: Number of bytes written=961440

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=270542

​		HDFS: Number of bytes written=718222

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=1

​		Rack-local map tasks=1

​		Total time spent by all maps in occupied slots (ms)=57500

​		Total time spent by all reduces in occupied slots (ms)=32190

​		Total time spent by all map tasks (ms)=5750

​		Total time spent by all reduce tasks (ms)=3219

​		Total vcore-seconds taken by all map tasks=11500

​		Total vcore-seconds taken by all reduce tasks=6438

​		Total megabyte-seconds taken by all map tasks=117760000

​		Total megabyte-seconds taken by all reduce tasks=65925120

​	Map-Reduce Framework

​		Map input records=8835

​		Map output records=8835

​		Map output bytes=303141

​		Map output materialized bytes=320933

​		Input split bytes=535

​		Combine input records=0

​		Combine output records=0

​		Reduce input groups=6012

​		Reduce shuffle bytes=320933

​		Reduce input records=8835

​		Reduce output records=23877

​		Spilled Records=17670

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=199

​		CPU time spent (ms)=6460

​		Physical memory (bytes) snapshot=1114484736

​		Virtual memory (bytes) snapshot=59344216064

​		Total committed heap usage (bytes)=2277507072

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=718222

17/04/21 10:29:01 INFO client.RMProxy: Connecting to ResourceManager at host98/10.3.242.98:8032

17/04/21 10:29:01 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.

17/04/21 10:29:02 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:29:02 INFO input.FileInputFormat: Total input paths to process : 1

17/04/21 10:29:02 INFO mapreduce.JobSubmitter: number of splits:2

17/04/21 10:29:02 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1492140941149_0061

17/04/21 10:29:02 INFO impl.YarnClientImpl: Submitted application application_1492140941149_0061

17/04/21 10:29:02 INFO mapreduce.Job: The url to track the job: http://host98:8088/proxy/application_1492140941149_0061/

17/04/21 10:29:02 INFO mapreduce.Job: Running job: job_1492140941149_0061

17/04/21 10:29:08 INFO mapreduce.Job: Job job_1492140941149_0061 running in uber mode : false

17/04/21 10:29:08 INFO mapreduce.Job:  map 0% reduce 0%

17/04/21 10:29:14 INFO mapreduce.Job:  map 50% reduce 0%

17/04/21 10:29:18 INFO mapreduce.Job:  map 100% reduce 0%

17/04/21 10:29:22 INFO mapreduce.Job:  map 100% reduce 100%

17/04/21 10:29:23 INFO mapreduce.Job: Job job_1492140941149_0061 completed successfully

17/04/21 10:29:23 INFO mapreduce.Job: Counters: 49

​	File System Counters

​		FILE: Number of bytes read=178139

​		FILE: Number of bytes written=677160

​		FILE: Number of read operations=0

​		FILE: Number of large read operations=0

​		FILE: Number of write operations=0

​		HDFS: Number of bytes read=877399

​		HDFS: Number of bytes written=158305

​		HDFS: Number of read operations=9

​		HDFS: Number of large read operations=0

​		HDFS: Number of write operations=2

​	Job Counters 

​		Launched map tasks=2

​		Launched reduce tasks=1

​		Data-local map tasks=2

​		Total time spent by all maps in occupied slots (ms)=60420

​		Total time spent by all reduces in occupied slots (ms)=32110

​		Total time spent by all map tasks (ms)=6042

​		Total time spent by all reduce tasks (ms)=3211

​		Total vcore-seconds taken by all map tasks=12084

​		Total vcore-seconds taken by all reduce tasks=6422

​		Total megabyte-seconds taken by all map tasks=123740160

​		Total megabyte-seconds taken by all reduce tasks=65761280

​	Map-Reduce Framework

​		Map input records=29889

​		Map output records=29889

​		Map output bytes=366155

​		Map output materialized bytes=178145

​		Input split bytes=527

​		Combine input records=29889

​		Combine output records=12023

​		Reduce input groups=6012

​		Reduce shuffle bytes=178145

​		Reduce input records=12023

​		Reduce output records=6012

​		Spilled Records=24046

​		Shuffled Maps =2

​		Failed Shuffles=0

​		Merged Map outputs=2

​		GC time elapsed (ms)=196

​		CPU time spent (ms)=7980

​		Physical memory (bytes) snapshot=1168166912

​		Virtual memory (bytes) snapshot=59356934144

​		Total committed heap usage (bytes)=2248671232

​	Shuffle Errors

​		BAD_ID=0

​		CONNECTION=0

​		IO_ERROR=0

​		WRONG_LENGTH=0

​		WRONG_MAP=0

​		WRONG_REDUCE=0

​	File Input Format Counters 

​		Bytes Read=0

​	File Output Format Counters 

​		Bytes Written=158305

[root@host98 ~/wttttt]$n