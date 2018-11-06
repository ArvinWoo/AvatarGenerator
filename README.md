# GitHub默认萌萌哒头像生成器
使用`Java`+`OpenCV3`制作，用于生成萌萌哒的`GitHub`默认头像，就像这种:

<img src="./img/1.png" width="200" height="200"/>
### 前言
最近看到一些头像 觉得 挺不错而且 蛮有规律的，特此找到一些资源自己测试了一下。头像效果图。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106172109606.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)
### 一、通过Eclipse使用OpenCV（Java）
>从2.4.4版本起OpenCV支持Java，本教程会讲解如何使用Eclipse做OpenCV Java开发在Windows/Linux下的环境搭建。因此您能享受垃圾回收的益处，非常refactorable（重命名变量，提取方法和诸如此类的东西）,现代编程语言可以让你编写代码很轻松，还能少犯错误。现在我们开始吧。

### 二、下载并安装OpenCV（OpenCv2.4版本以上）
**下载地址：**[OpenCV (Open Source Computer Vision Library) ](https://opencv.org/releases.html)
1.2 解压与安装
下载完后得到文件 opencv-[X版本].exe，双击后会提示解压到某个地方，比如C:\Users\ArvinWoo\Desktop，双击即可加压。
![双击即可解压](https://img-blog.csdnimg.cn/20181106170130542.png)
（因为OpenCV项目文件打包的时候，根目录就是opencv，所以我们不需要额外的新建一个名为opencv的文件夹，然后再解压，那是多此一举的事情）然后点击Extract按钮
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106170052826.png)
打开解压目录opencv
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106170240713.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)

### 三 、下载项目，在eclipse中调用OpenCV库

[java项目代码](https://github.com/ArvinWoo/GithubAvatarGenerator) 
Git 下载项目后，导入Eclipse。

### 四、导入项目后，进行OpenCV的配置
启动Eclipse并选择Window->Preferences菜单。 
![在这里插入图片描述](https://img-blog.csdnimg.cn/2018110617051749.png)

2、导航到Java->Build Path ->User Libraries并点击New ….

![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106170540388.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)

3、输入名称例如OpenCV-[X版本]，作为你新库的名字,现在选择新建的用户库，并且点击Add External JARs… 找到刚才的OpenCV安装目录：C:\Users\ArvinWoo\Desktop\ **opencv\build\java** ，选择该目录下的包：opencv-[X版本].jar
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106170716178.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106170805536.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)

添加完jar包后，展开OpenCV-x.x.x并选择Native library location并且点击**Edit**…
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106170951877.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)

选择 External Folder（外部目录），浏览到需要选择的目录，Windows为C:\Users\ArvinWoo\Desktop\ **opencv\build\java\x64** ，
**如果你使用的是32-bit操作系统需要选择x86目录替换x64.。
Linux为/home/kingroc/source/opencv-3.1.0/build/lib。** 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106171113522.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)

附上项目测试

![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106171519970.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181106171812851.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM3NTk1OTQ2,size_16,color_FFFFFF,t_70)
