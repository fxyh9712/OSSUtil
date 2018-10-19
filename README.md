JAVA二次封装阿里OSS对象存储

/OSSUtil/src/main/java/com/fxyh/ossutil/storage/AliStorage.java工具类集成工具方法

/OSSUtil/src/test/java/com/fxyh/AppTest.java 测试类

/OSSUtil/src/main/resources/export.txt 样式文件，导入样式，选择这个文件

/OSSUtil/src/main/resources/oss.properties OSS对象配置文件，秘钥...

导入后请更改oss.properties里面的内容，更改成你对应的内容。

---
**文件结构**  
├── pom.xml  
├── README.md  
├── src  
│   ├── main  
│   │   ├── java  
│   │   │   └── com  
│   │   │       └── fxyh  
│   │   │           └── ossutil  
│   │   │               ├── OSSConfigure.java  
│   │   │               ├── OSSUtil.java  
│   │   │               ├── storage  
│   │   │               │   ├── AliImg.java  
│   │   │               │   ├── AliStorage.java  
│   │   │               │   ├── AliWrapper.java  
│   │   │               │   ├── FileTypeHelper.java  
│   │   │               │   ├── FileType.java  
│   │   │               │   └── ThumbModel.java  
│   │   │               └── util  
│   │   │                   ├── Assert.java  
│   │   │                   ├── IOUtil.java  
│   │   │                   └── StringUtils.java  
│   │   └── resources  
│   │       ├── export.txt  
│   │       ├── oss.png  
│   │       └── oss.properties  
│   └── test  
│       └── java  
│           └── com  
│               └── fxyh  
│                   └── AppTest.java  
└── target  
    ├── classes  
    │   ├── com  
    │   │   └── fxyh  
    │   │       └── ossutil  
    │   │           ├── OSSConfigure.class  
    │   │           ├── OSSUtil.class  
    │   │           ├── storage  
    │   │           │   ├── AliImg.class  
    │   │           │   ├── AliStorage.class  
    │   │           │   ├── AliWrapper.class  
    │   │           │   ├── FileType.class  
    │   │           │   ├── FileTypeHelper.class  
    │   │           │   └── ThumbModel.class  
    │   │           └── util  
    │   │               ├── Assert.class  
    │   │               ├── IOUtil.class  
    │   │               └── StringUtils.class  
    │   ├── export.txt  
    │   ├── META-INF  
    │   │   ├── MANIFEST.MF  
    │   │   └── maven  
    │   │       └── com.fxyh  
    │   │           └── OSSUtil  
    │   │               ├── pom.properties  
    │   │               └── pom.xml  
    │   ├── oss.png  
    │   └── oss.properties  
    ├── generated-sources  
    │   └── annotations  
    ├── generated-test-sources  
    │   └── test-annotations  
    ├── maven-archiver  
    │   └── pom.properties  
    ├── maven-status  
    │   └── maven-compiler-plugin  
    │       ├── compile  
    │       │   └── default-compile  
    │       │       ├── createdFiles.lst  
    │       │       └── inputFiles.lst  
    │       └── testCompile  
    │           └── default-testCompile  
    │               ├── createdFiles.lst  
    │               └── inputFiles.lst  
    ├── OSSUtil-1.0.jar  
    ├── surefire-reports  
    │   ├── com.fxyh.AppTest.txt  
    │   └── TEST-com.fxyh.AppTest.xml  
    └── test-classes  
        └── com  
            └── fxyh  
                └── AppTest.class  

---
