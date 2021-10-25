# 芮琪的poker night
## 題目敘述:

芮琪是你最近在網路上聊得很開心的女網友

有天他迷上了玩 discord 測試功能中的遊戲 poker night

對遊戲的熱情也讓他開始研究真正的 德州撲克

但這種牌類遊戲對比較擅長玩fps遊戲的芮琪來說有點難度

所以導致她在判斷撲克牌組大小的時候都很有障礙

所以你決定發揮你在這一兩個月學到的資訊技術

寫一個程式幫助他解決這個問題


## 輸入與輸出說明:

輸入的第一行有一個數字`n`

代表輸入資料的筆數

接下來有`n`行

每行有五個字串

每個字串由字串上的數字(或字母) + 花色 所組成

其中 梅花、菱形、紅心、黑桃 分別以  W、X、Y、Z  所代表

```
2
10Z JZ QZ KZ AZ
2X 7Z 7W 7Y 9X
```


請根據以下這張表格
![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBzuHHIPEm1J7OmR4C1779oJ6ruUEXUddADoSc-OJ0zJwbw__jGdhtH1Wv2Z4GK2rlgy0&usqp=CAU)
輸出此五張牌中最大的組合之`英文名字`

大小依序為:
1. 同花大順 (Royal Flush)
2. 同花順 (Straight Flush)
3. 四條 (Four of a Kind)
4. 葫蘆 (Full House)
5. 同花 (Flush)
6. 順子 (Straight)
7. 三條 (Three of a Kind)
8. 兩對 (Two Pairs)
9. 一對 (One Pair)
10. 高牌 (High Card)


```
Royal Flush
Three of a Kind
```