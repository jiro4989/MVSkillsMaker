MVSkillsEditor マニュアル
================================================================================

これはRPGツクールMVのスキルデータベースを表形式で作成するためのツールです。

作者             : 次郎(Jiro)  
作成日           : 2016/11/30  
最終更新日       : 2016/12/11  
連絡先           : [避難所のひとつ](http://ashelter.blog.fc2.com/)  
実行ファイル名   : MVSE.jar  
動作確認・開発環境  
- OS             : Windows7 64bit Home Premium, LinuxBean12.04
- プロセッサ     : 3.50GHz Intel Core i7-4770K
- メモリ         : 8GB RAM
- Javaバージョン : 1.8.0-111

## 目次 ########################################################################

- [ ソフトウェア概要             ] ( #ソフトウェア概要             )
- [ 動作条件                     ] ( #動作条件                     )
- [ 実行方法                     ] ( #実行方法                     )
- [ 使い方                       ] ( #使い方                       )
- [ 操作方法・ショートカットキー ] ( #操作方法・ショートカットキー )
- [ 注意点・不具合など           ] ( #注意点・不具合など           )
- [ 利用規約                     ] ( #利用規約                     )
- [ 補足                         ] ( #補足                         )
- [ その他・作者からのお願い     ] ( #その他・作者からのお願い     )
- [ 更新履歴                     ] ( #更新履歴                     )

## ソフトウェア概要 ############################################################

このソフトは、RPGツクールMVのスキルデータベースを手際よく作成するためのツール
です。

標準のスキル編集画面は大量のデータを比較するのに不便で、データの編集も１つの
データの１つの項目のみしか編集できません。同じタイプのスキルだけれど、一部だけ
が異なるデータの変更をする時に手間がかかります。

複数のレコードを一括に編集できたり、レコードの途中挿入が可能になれば大量のスキ
ルデータを手早く編集できると考え、作成しました。

また、このツールは必要なデータベースファイルさえあれば、ツクールMVがインストー
ルされていない環境でも動作します。

出先でもデータベースを作成したいといったことがもしあれば、メニューから"必須ファ
イルをコピー"でツクールMVのプロジェクトを選択し、inputフォルダに必須ファイルを
コピーしてください。コピーした後、MVSkillsEditorフォルダを出先PCにコピー・移動
すればそちらの環境でもファイルの編集ができます。

## 動作条件 ####################################################################

本ソフトウェアを実行するにはJavaがインストールされている必要があります。もし
Javaがインストールされていない場合は、下記の手順にしたがってインストールを完了
してください。  
[Oracle Javaインストール](https://www.java.com/ja/download/help/download_options.xml)  

また、本ソフト作成時のJavaのバージョン以上のJava実行環境がインストールされてい
る必要があります。もしJavaがインストールされている環境で本ソフトが実行できな
かった場合は、下記の手順に従って最新のJavaにアップデートしてください。  
[Oracle Javaアップデート](https://java.com/ja/download/)  

それでも起動できなかった場合は、お手数ですがFAQの項目を確認した後に、README先頭
の連絡先より製作者に報告をお願いいたします。

## 実行方法 ####################################################################

"MVSE.jar"をダブルクリックしてください。  
LinuxOSをご使用の方はターミナルから"java -jar MVSE.jar"と打ち込んでください。

## 使い方 ######################################################################

1. ファイルを開きます。Skills.jsonの編集には複数のファイルが必要になるため、
   ファイルを開くときはフォルダを指定して開きます。
   
   メニューのファイルの"プロジェクトから開く"を選択してください。プロジェクト
   とは、RPGツクールMVで生成したプロジェクトフォルダを指し、Game.rpgprojectが
   存在するフォルダを意味します。
   
   ファイルを開いたとき、デフォルト設定でMVSEのフォルダのbackupフォルダに取得
   したSkills.jsonの編集前のデータのコピーを保存します。万が一何かしらの不具合
   があり、データが保存できない場合やツクールで不具合があった場合はbackupフォ
   ルダから復元してください。

2. 必要に応じてファイルを編集します。ファイルの保存はショートカットか、メニュー
   の"上書き保存" から行います。
   
   プロジェクトから開いた場合は開いたフォルダを上書きします。インプットフォル
   ダから開いた場合、インプットフォルダ内のSkills.jsonが上書きされます。

## 操作方法・ショートカットキー ################################################

| 対象     | 修飾キー   | 操作            | 動作                              | 備考                                 |
|:--------:|------------|-----------------|-----------------------------------|--------------------------------------|
| 全般     | Ctrl       | O               | projectフォルダからファイルを開く |                                      |
| 全般     | Ctrl-Shift | O               | inputフォルダからファイルを開く   |                                      |
| 全般     | Ctrl       | S               | Skills.jsonの上書き保存           |                                      |
| 全般     | Ctrl       | Z               | 元に戻す(アンドゥ)                |                                      |
| 全般     | Ctrl       | Y               | やり直す(リドゥ)                  |                                      |
| 全般     | Ctrl       | Q               | 前のデータに移動(MVのF4に相当)    |                                      |
| 全般     | Ctrl       | E               | 次のデータに移動(MVのF5に相当)    |                                      |
| 表       |            | 右クリック      | コンテキストメニューを開く        |                                      |
| 表       |            | ﾏｳｽｽｸﾛｰﾙ        | 垂直方向へスクロール              |                                      |
| 表       | Shift      | ﾏｳｽｽｸﾛｰﾙ        | 水平方向へスクロール              |                                      |
| 表       |            | ﾏｳｽﾄﾞﾗｯｸﾞ(上下) | 数値セル : 1数値の増減            | 複数行可。ただし全て同じ値になる     |
| 表       | Ctrl       | ﾏｳｽﾄﾞﾗｯｸﾞ(上下) | 数値セル : 5数値の増減            | 同上                                 |
| 表       | Shift      | ﾏｳｽﾄﾞﾗｯｸﾞ(上下) | 数値セル : 10数値の増減           | 同上                                 |
| 表       |            | ﾀﾞﾌﾞﾙｸﾘｯｸ       | アイコンセル : アイコン選択       | 複数行可                             |
| 表       |            | ﾀﾞﾌﾞﾙｸﾘｯｸ       | 会心セル     : あり、なし切り替え | 複数行可                             |
| 表       |            | ﾀﾞﾌﾞﾙｸﾘｯｸ       | その他のセル : テキスト入力       | Enterキーで編集完了                  |
| 表       |            | ﾀﾞﾌﾞﾙｸﾘｯｸ       | その他のセル : コンボボックス選択 |                                      |
| 表       |            | Enter           | 説明セル     : テキスト入力       | *Cltl-Enterで編集完了*               |
| 表       |            | Enter           | その他のセル : テキスト入力       | Enterキーで編集完了                  |
| 表       |            | ｺﾝﾎﾞﾎﾞｯｸｽ(上部) | 選択セルの上書き                  | 複数行可                             |
| 表       |            | ﾃｷｽﾄ入力(下部)  | 選択セルの編集                    | Ctrl-Enterで上書き。編集方法を変更可 |
| 表       |            | ｺﾝﾎﾞﾎﾞｯｸｽ(下部) | テキスト入力(下部)に追加          | Ctrl-Enterで単語の登録               |
| 使用効果 |            | 右クリック      | コンテキストメニューを開く        |                                      |
| 使用効果 |            | Enter           | 編集画面を開く                    | OKで上書き、追加で新しく挿入         |

## 注意点・不具合など ##########################################################

1. Javaをインストールしていない環境では動作しないと思います。そういった場合は
   Javaのインストール手順に従って、本ツール のバージョン以上のものを使用してく
   ださい。

2. ファイル破損などが起きないよう慎重にデバッグを行って おりますが、個人製作と
   いうこともあり、確認がいたってい ない部分も多いと思います。
   
   上書き保存して扱うSkills.jsonは デフォルト設定でバックアップをとるようにして
   います。一応バックアップ保存のON/OFFは設定から変更できますが、なるべく変更し
   ないようにしてください。もしSkills.jsonに不具合が発生した場合は、backupフォ
   ルダ から復元してください。
   
   また、バグが確認されたら製作者ブログ、またはツクマテコミュニティの配布ページ
   で報告をして いただけると助かります。

3. このツールはスキルの編集を行うことしかできません。  
   また、スキル以外のデータベースファイルをツール起動中に変更しても、ツール内
   のデータは更新されません。  
   このツールを起動中はなるべく他のデータベースを編集しないようにしてくださ
   い。

4. テーブルで"コピー"、"切り取り"といった操作を行いますが、クリップボードへのコ
   ピーではなく、ツール内でのみ使用 できるコピーとなっています。コピーをツール
   再起動後に引き継ぐといったことはできません。

5. メモセルの編集をメモ欄から行った場合、元に戻す、やり直す が実行できません。

6. ツクールMVが生成するデータベースファイルが必須です。それらのファイルを生成す
   る機能はありません。
   必須のファイルは下記のとおりです。
   - Animations.json
   - CommonEvents.json
   - Iconset.png
   - Skills.json
   - States.json
   - System.json
   これらのうち、Skills.jsonは上書き保存でファイル内容が変更されます。

## 利用規約 ####################################################################

- 配布している素材を利用したことで発生した問題に対して、私は一切の責任を負いま
  せん。
- 著作権は私(次郎)が有しています。私が死亡して５０年経過するまで決して放棄する
  ことはありません。
- 再配布はお控えください。
- 利用規約を事前連絡なしに変更する場合があります。その場合は最新の規約が適用さ
  れるものとします。

### 補足 #######################################################################

- 利用できる作品
  - ツクール用に作成しましたがツクール作品以外の素材作成が目的でも利用可能で
    す。
  - 有償作品、エロゲー、グロゲーでも利用可能です。
  - ゲーム作品以外でも利用可能です。

- 利用報告
  - READMEへの記載はしなくても結構です。
  - 使用報告もしなくて結構です。

## その他・作者からのお願い ####################################################

バグの報告は【連絡先】の製作者ブログか、ツクマテコミュニティのツール配布のペー
ジでお願いします。

新しい機能の実装のご要望をいただいた場合、実装する場合もある
かもしれませんが、必ずではないことをご了承ください。

## アンインストール方法 ########################################################

本ソフトはレジストリを変更していませんので、配布時のフォルダごとゴミ箱にぶち込
んでいただければアンインストールできます。

もし本ソフトの実行ファイルをフォルダの外に移動した実行した場合は、自動で生成さ
れる各種フォルダを削除していただければ、アンインストールは完了です。

ただし、その際バックアップファイルも一緒に削除しないようにご注意ください。

## 更新履歴 ####################################################################

Ver1.0: 2016/11/30
- プログラム公開

Ver1.1: 2016/12/01
- 会心セルを選択中にEnter、またはSpaceキーを押すと
  あり、なしを切り替えられるように変更

Ver1.2: 2016/12/11
- 左側のテーブルと右側のテーブルのスクロールがずれる不具合
  を修正
- セルを何も選択していない状態で左側のテーブルの空きセルを
  選択するとエラーをはいていた不具合を修正
- データを保持していないセルの上にマウスカーソルがあっても、
  セルの色が変化しないように変更。
  データを保持するセルのみ色が変わるように。
- アイコンセルと会心セルのグラフィックが、行削除の直後に残
  ってしまっていた不具合を修正。
- 設定項目から、セルの縦幅を25ptまで変更できるように拡張。
