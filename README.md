# First
测试github用法0.0
关于测试类的问题：不知道什么原因没有按照预期的测试类生成，
预测的是test为Tests目录，java为测试类源代码目录（代码运行在其中），
但是实际上是测试类的源代码生成在java目录中，同时java目录是Tests目录
根据网上更改的将out path目录更改为${SOURCEPATH}/../../test/java/${PACKAGE}/${FILENAME}
将package test.$entry.packageName; 中的test.去除。
好像有个插件配置能解决这个问题，但是没有找到，下次找到了补上。
