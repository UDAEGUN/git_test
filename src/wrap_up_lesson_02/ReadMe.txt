前提事項

    ・ 今回の Activity では「Main」「HouseholdExpenses」「Expense」の3つのクラスを作成します
     　それぞれのクラスが持つ役割は以下の通りです

        - Main
            - プログラムを開始するための main メソッドを持つクラス
                - ユーザからの操作受付
                - HouseholdExpenses が持つ各種機能の呼び出し

        - HouseholdExpenses
            - 家計簿が持つ機能を提供するクラス
                - 受け取った支出情報を記録
                - 記録されている支出情報を分類別に集計し、集計結果を出力
                - 記録されている支出情報のうち、指定された分類に当てはまるものを一覧として出力

        - Expense
            - 1回分の支出情報を表すクラス
                - JavaBeans 形式
                - HouseholdExpenses クラスの中で利用される


    ・ 上記の3つのクラスについて、『Definition_【クラス名】.txt』という名前で
    　 詳細な指示が書かれたテキストファイルが用意されています
    　 Expense ⇒ HouseholdExpenses ⇒ Main の順に参照し、プログラムを完成させましょう