# Tomcat-Source-Code
> 为了学习tomcat源码，并再学习源码时对源码做注释，用于加深理解


### Quick Start!! 快速开始

star 之后点击clone， 使用IDEA 或 eclipse （本人是IDEA）配置 VM options，
配置 maven , 配置 output 目录.

然后Run Bootstrap


VM options参数：
-Dcatalina.home=tusix-tomcat
-Dcatalina.base=tusix-tomcat
-Djava.endorsed.dirs=tusix-tomcat/endorsed
-Djava.io.tmpdir=tusix-tomcat/temp
-Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager
-Djava.util.logging.config.file=tusix-tomcat/conf/logging.properties
-Dcode.output=tusix-code/target


