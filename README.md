# 【第3回】フレームワークを使ったプログラミング
## テーマ
1. 入力フォームの追加

## 開発環境について
* この演習では、Codespacesと呼ばれるサービスを使って開発を行います。
* ブラウザ上で動作する開発環境です、インストール不要で使う事ができます。

## Codespacesで実行してみよう
* 第一回で実施した[手順](/Codespacesの実行手順.md)を参照してください。

## 入力フォームの追加について学習
1. `Let's try!`を押します。
![image](https://user-images.githubusercontent.com/32722128/151711407-d882c0da-6c60-409f-99da-e5da064575a0.png)

2. コメント投稿画面が表示される事を確認しましょう。
![image](https://user-images.githubusercontent.com/32722128/151711431-a1d7b9f3-8f02-4b6c-804b-cc989640df67.png)

3. 名前とコメントを記入し、`コメント投稿`ボタンを押しましょう。
![image](https://user-images.githubusercontent.com/32722128/151711584-171cc707-382b-4c4d-8cc9-5b01cfb3b67c.png)

4. 確認画面が表示される事を確認しましょう。
![image](https://user-images.githubusercontent.com/32722128/151711609-1170703b-7eff-4d08-b8b7-eaa628933c72.png)

5. 確認が終わったら、タブを閉じましょう
![image](https://user-images.githubusercontent.com/32722128/150733257-a1056c19-1b24-412b-8bfc-a6063e75c785.png)

6. デバック実行中ですので、停止ボタンを押して、デバック実行を停止しましょう。
![image](https://user-images.githubusercontent.com/32722128/150748527-d7121765-5142-4f5a-9769-33c0c23627a4.png)

## 解説
### フォームクラス
* ControllerからThymleafへデータを受け渡すために、フォームクラスと呼ばれるクラスのオブジェクトでデータの受け渡しを行っています。
* 今回は、以下のパスのCommentクラスをフォームクラスとして使用しています。
* `~/src/main/java/com/classroom/assignment/model/request/Comment.java`
![image](https://user-images.githubusercontent.com/32722128/151712493-5d3a2176-5dcb-49ca-b0dd-dcee51e0c3b1.png)

* HTMLのinput要素に付与されたname属性の値がフォームクラスの変数名と一致していれば、Controllerの引数にフォームクラスを指定する事で、値を受け取る事ができます。
![image](https://user-images.githubusercontent.com/32722128/151712894-8cb16e89-dba4-45ee-8b9d-88db789519f1.png)
![image](https://user-images.githubusercontent.com/32722128/151712931-a264f299-6251-40d3-9e9a-9e5b251a422d.png)
![image](https://user-images.githubusercontent.com/32722128/151712961-43dbfa44-c261-49f2-85b3-29e04eab0ee2.png)

## 演習level2 step3
1. STEP-3のページを開きます。
![image](https://user-images.githubusercontent.com/32722128/151711786-55207e89-0b94-4047-b265-5cc509873909.png)

2. 名前、コメント内容に追加して、メールアドレス項目を追加してください。
![image](https://user-images.githubusercontent.com/32722128/151712040-e53709f4-38b8-4454-b010-38551bb52118.png)

3. 確認画面でもメールアドレスが表示されるようにしてください。
![image](https://user-images.githubusercontent.com/32722128/151712095-4d67f00a-ecf7-4270-858d-00b13328531c.png)

4. メールアドレス項目のinput属性のname要素は`mail`としてください、異なっていると、テストが通りません。

## ヒント
1. フォームクラスにメールアドレス項目を追加しましょう。  
* 編集先:`~/src/main/java/com/classroom/assignment/model/request/Comment.java`

2. Thymeleafのテンプレートファイルにメールアドレス項目を追加しましょう。 
* 編集先:    
* `~/src/main/resources/templates/step3/confirm.html`  
* `~/src/main/resources/templates/step3/index.html`  

3. addAttributeメソッドを使用して、メールアドレス項目をmodelに追加しThymeleafへ値を渡しましょう。
* 編集先:`~/src/main/java/com/classroom/assignment/controller/Step3Controller.java`

## テスト
* 提出前に回答があっているかテストしてみましょう。

1. `~/src/test/java/com/classroom/assignment/controller/api/Step3ControllerTests.java`を開きます。
2. クラス名の前の再生ボタンをクリックします。(画面コピーは一度テスト実施済みのためチェックマークに変わっています。)
![image](https://user-images.githubusercontent.com/32722128/151714348-346b8b8e-cecc-43c6-82df-0c23de61fead.png)

3. 再生ボタンがチェックマークに変わればテスト成功です！

## 課題の提出
* 課題の提出は第一回と同じ[操作](/課題の提出手順.md)のコミット・プッシュ・プルリクエストを実施しましょう。
