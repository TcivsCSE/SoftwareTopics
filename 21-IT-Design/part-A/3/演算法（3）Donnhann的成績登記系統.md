# Donnhann的成績登記系統

## 題目敘述:

眾所皆知 熊貓的成績系統是他自己透過VB寫出來的

有天 張Donnhann 看到了熊貓在資訊科辦coding的帥氣身影

對coding有著強烈天賦的電神張Donnhann

心想"這應該沒有很難吧 想一下想一下"

於是想要復刻出這個系統的CLI版本

不過開始寫後 

他發現 "靠北 好像有點難"

於是他就放棄了

並且將這個重大的任務託付了給你

請你幫忙

不過貼心的暖男 張Donnhann 在放棄前幫你分析了這個程式所需要的功能

如下:

一個成績系統所需要的資料包括

**學生資料** 與 **學生成績**


一個成功的成績登記系統

必須要具備以下功能:
- 新增學生資料
- 查詢學生資料
- 新增成績
- 修改成績


## 輸入與輸出說明:


請使用C++來建立一個成績登記系統

請你幫助張Donnhann 並奪走他電神的稱號吧

總共需要建立4個方法

以下是這些方法的輸入值
```
Student Add 學號:Int 姓名:String

Student Search 學號:Int

Score Add 學號:Int 科目:String 考試名稱:String 成績:Int

Score Edit 學號:Int 科目:String 考試名稱:String 成績:Int
```


## Student Add:

新增學生資料 資料包括 **學號** 和 **姓名**

新增成功時 輸出 `Student Add Successful`

  
## Score Add:

透過 **學號** 新增 **分數** 其中也需要帶入 該筆成績的 **科目** 與 **考試名稱**

新增成功時 輸出 `Score Add Successful`


## Score Edit:

透過 **學號** , **科目** 和 **考試名稱** 修改該筆 **分數**

修改成功時 輸出 `Score Edit Successful`

  
## Student Search:

透過 **學號** 輸出 該學生的 **姓名** 和 **成績**

查詢成功時輸出該學生的 **資料** 與 **成績**

資料輸出順序以與資料輸入順序相同

  
查詢成功時輸出格式如下:

```

學號 姓名:
科目1 考試名稱1 分數1
科目2 考試名稱2 分數2
...

```

輸出學生資料時 學生資料的頭和尾都必須空一行
  
  
## 範例輸入一:

```
Student Add 910615 無剩尾
Score Add 910615 基本電學 第一次月考 92
Score Add 910615 基本電學 第二次月考 85
Score Edit 910615 基本電學 第一次月考 96
Student Search 910615
```

## 範例輸出一:

```

910615 無剩尾:
基本電學 第一次月考 96
基本電學 第二次月考 85

```

## 範例輸入二:

```
Student Add 910615 無剩尾
Student Add 810614 合成祥
Score Add 910615 基本電學 第一次月考 92
Score Add 910615 基本電學 第二次月考 85
Score Add 810614 國文 第一次月考 15
Student Search 910615
Score Add 810614 英文 第一次月考 30
Student Search 810614
```

## 範例輸出二:

```
Student Add Successful
Student Add Successful
Score Add Successful
Score Add Successful
Score Add Successful

910615 無剩尾:
基本電學 第一次月考 96
基本電學 第二次月考 85

Score Add Successful

810614 合成祥:
國文 第一次月考 15
英文 第一次月考 30

```

## 檔案儲存方式

請將此程式檔存為 a03.cpp 

執行檔存為 a03.exe

放置於`/21-IT-Design/part-A/3/ans/`中




