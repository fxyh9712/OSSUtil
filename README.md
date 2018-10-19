JAVA二次封装阿里OSS对象存储

AliWrapper工具类集成工具方法

---
文件结构  
├── pom.xml  
├── README.md  
├── src  
│   ├── main  
│   │   └── java  
│   │       └── com  
│   │           └── fxyh  
│   │               └── ossutil  
│   │                   ├── OSSConfigure.java  
│   │                   ├── OSSUtil.java  
│   │                   ├── storage  
│   │                   │   ├── AliImg.java  
│   │                   │   ├── AliStorage.java  
│   │                   │   ├── AliWrapper.java  
│   │                   │   ├── FileTypeHelper.java  
│   │                   │   ├── FileType.java  
│   │                   │   └── ThumbModel.java  
│   │                   └── util  
│   │                       ├── Assert.java  
│   │                       ├── IOUtil.java  
│   │                       └── StringUtils.java  
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
    │   └── META-INF  
    │       ├── MANIFEST.MF  
    │       └── maven  
    │           └── com.fxyh  
    │               └── OSSUtil  
    │                   ├── pom.properties  
    │                   └── pom.xml    
    └── test-classes    
        └── com      
            └── fxyh            
                └── AppTest.class    




---
