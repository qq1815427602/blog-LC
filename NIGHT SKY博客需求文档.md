# NIGHT SKY博客需求文档

## 需求规格说明书 

### 版本：1.0



#### 1.系统说明

##### 	1.1 概述 : 

> ​	该项目是一款适用于个人编写技术文档，记录错误，分析心得，自我介绍，一款个性化的软件，用于个	   	人练手学习使用，完成后会部署到阿里云作为一个记录自己生活学习的一个点点滴滴的工具



#### 2.技术选型

##### 	2.1 说明 : 

> ​		项目主要适应多端，手机端和PC端要求页面自适应 ，后期有能力可扩展移动端APP，
>
> ​		项目无高并发问题，主要面对用户量并发量低于200而设计。因此不考虑高并发问题；



#### 3.可行性分析

##### 	3.1 系统基本要求

##### 		3.1.1 采用架构 : 

> ​		项目采用浏览器 / 服务器 (B/S) 架构 : 浏览器可用谷歌 火狐 360 等主流浏览器 最低支持 IE 8 ，服务器端		采用Tomcat 9.0 数据库采用 MySQL5.5版本。

##### 		3.1.2 主要功能需求 : 

​		主要分为三大模块功能 : 博客模块 ，用户模块 ，系统模块等

> ​		(1) 博客模块主要包括的功能 : 阅读博客 ，编写博客，管理博客 ，博客评论 
>
> ​		(2) 用户模块主要包括的功能 : 登录 ，注册，个人空间 ，个人信息查询修改，查看个人空间收藏等；
>
> ​		(3) 系统管理 : 用户管理 ，博客分类与归类，公告管理，评论管理，链接[友情链接等]，系统的维护[如头			 部标题名,备案信息等修改]

##### 		3.2.1 系统运行环境 ：

> ​		服务器采用Linux进行部署 ，浏览器端使用装有基本浏览器的操作系统即可，一般安卓 ，PC ，IOS都可

##### 		3.2.2 费用开支与效益分析 : 

> ​		(1) 租用阿里云服务器 9.5/月 环境搭建采用免费开源软件
>
> ​		(2) 代码开发 ， 因项目开发为个人博客系统 ，所需开发与维护人员为2（罗某与隆祖哥）
>
> ​		综合以上 ，各项费用基本为 0 只需要付租服务器的钱 ， 网站为非盈利的网站，纯经济效益为 0 ，或贴		个二维码拉赞助 反正也赚不到两毛钱 2333

##### 		3.3.1 其他各因素的可行性分析 : 

> ​			搭建符合博客用户自己使用习惯的系统，且不关心系统经济效益，因此可用性较佳。

##### 		3.3.2 法律方面分析 : 

> ​		法律方面的问题较多，主要涉及到著作权、专利权等方面法律问题，软件人员与个人博客使用用户通常		是不熟悉的，需注意研究，鉴于个人博客系统的非盈利性、非广泛传播特点，法律问题一般不会涉及较多 , 警察叔叔哪有时间来管我们这种小鱼小虾 ，身正不怕影子斜 QAQ 。
>
> 

#### 4.可行性分析总结

> 上述可行性分析，参考现有开发资料、文档等资源，个人博客系统的体系结构比较完善，开发要求相比		于复杂的系统较低，具备进一步进行需求分析与后续开发的条件 ， 只要有隆祖哥在 ，那都不是事。
>
> 
>
> 基于个人博客的特点 ，本系统实现个人博客的主要功能 ，包括博客系统的管理员，普通用户的登录 / 退		出 ，管理员发表文章等 ，用户发表评论 ，分页浏览查询文章等 。博客系统主要区分为两类用户 ，分别		为博客管理员和普通用户。管理员可以登录写下自己的文章 ，普通用户主要的功能是分页 ，分类 , 分标阅读博客站主的文章和浏览图片 ，发表评论和留言以及浏览其他内容。以上是个人博客系统需求分析的最终实现目标，由于个人博客的个性化特点，还应实现博客站主自定义网站系统页面的功能，如添加标签栏、归档栏、日历、横幅图片、寄语等包括但不限于此的个性化功能。

​	以上为项目的可行性分析，自此向下为博客系统的功能描述



#### 5.功能描述

##### 	5.1 文章功能 ：

> ​	这是核心业务，因为博客看的就是帖子，咱们写文章，提供给用户看，文章要有后台动态编写，管理
>
> ​	前端用户可以评论 ，点赞  ，收藏 ，同时被看点击的文章记录点击信息 ，进行动态排序到某列表菜单，
>
> ​	首页帖子采用时间倒序，头部采用被置顶的文章，后台可以设置文章置顶。展示的文章拥有 记录信息 如
>
> ​	点赞 ：666  ，创建于 0202年1月15号 ，字数：888 



##### 		需求 1 : 写文章

​		角色 : 作者

​		使用场景 

​		进入创作页面 ，使用富文本编辑器创作后进行文件上传 ，文章要进行分类比如 [技术] , [生活] , [动漫].... 。

​		[PS：轮询保存进入内存或者本地Cookie或者会话结束保存 ，防止停电丢失数据回到解放前等丧心病狂操作]



​		用例：

​		1 . 用户打开创作页面 ，使用编辑器创作一篇文章 ， 完成后保存 ;

​		2 . 用户打开创作页面 ，使用编辑器创作一篇文章 ，未完成保存 ;

​		3 . 用户写文章写一半 ，觉得自己写的很烂 ，就退了，询问是否保存 ;

​		

##### 		需求 2 : 文章置顶功能

​		角色 : 作者

​		使用场景

​		进入文章管理页面进行按钮置顶  ， 使首页页面置顶此文章



​		用例 : 

​		1 . 用户觉得自己写的文章简直TM 写的比莎士比亚全集还好 ，打算到最醒目的广告位放上他 ，因此点击了此			文章的置顶按钮 , 文章修改置顶状态码字段，刷新Redis里面的置顶区域缓存 ，进行存入 。



​		用例

1.用户打开创作页面，使用网页文本编辑器创作一篇文章，完成后发布
 2.用户打开创作页面，使用网页文本编辑器创作一篇文章，未完成保存
 3.用户打开创作页面，使用上传自己在本地写的文本，保存或发布
 4.用户写文章写一半觉得写的很垃圾，就退了，要问他是否要保存

##### 		需求 2 ：以发布的文章进行修改和删除

​		角色 : 作者

​		使用场景

​		在文章管理页面 , 可以选择对已经发布的文章修改和删除

​		

​		用例：

​		1 . 用户在文章管理页面删除谋篇文章 , 删除后的文章修改状态 , 进入草稿箱 ;

​		2 . 用户觉得自己以前写的文章像个弟弟写的 , 想要修改 ，点击修改后进入编辑器 ，编辑器把这弟弟文章已有			的内容读取出来 ，修改完成后可以保存或者取消 ，取消便撤销回原样 ，保存即发布文章 ;

​	

##### 		需求 3 ：草稿箱的文章的修改或删除

​		角色 : 作者

​		使用场景

​		草稿箱的已删除文章 ，用户选择继续编写发布或者删除

​		

​		用例：

​		1. 用户进入草稿箱 ，选择一个草稿删除 ， 删除后进入垃圾箱 ;

​		2. 用户修改草稿 ，完成后可以保存 , 发布 , 取消 ;

​		

##### 		需求 4 : 垃圾箱文章的删除和恢复

​		角色 : 作者

​		使用场景

​		垃圾箱的已删除文章 , 用户选择彻底删除 或者进行恢复到草稿箱

​		

​		用例 :

​		1. 用户进入垃圾箱 , 选择一个文章进行删除 ， 删除后 它便从这个世界消失 ，不留下一点痕迹 ;

​		2. 用户进入垃圾箱 ，选择一个文章恢复，恢复后的文章进入草稿箱，页面随即跳转进入草稿箱 ;

##### 5.2 评论功能 :

> 因为大家都喜欢吐槽，所以文章底部需配备一个评论区用于文章评论 ，对于发违章信息 不良内容的骚年，我们后台需配备一个评论管理功能 ，用于查看用户评论信息 ，属于哪个帖子 ，或者直接从某文章的列表点击查看此文章评论按钮查询属于该文章的所有评论并进行跳转



##### 	2.2 登录功能 ：

> 用户可以进行注册,登录 查看个人中心，去提问大区进行提问，评论等功能。



##### 	2.3 分类功能 ：

> 既然是技术性博客，就要进行技术分类，比如Myabtis为一个分类，Spring为一个分类 进行不同文章的筛选分类，或者不同文章 比如 动漫 音乐 技术的分类



##### 	2.4 友情链接功能 ：

​	可以记录博主的朋友的博客链接地址，展示 跳转











##### 





