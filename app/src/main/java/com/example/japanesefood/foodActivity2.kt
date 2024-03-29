package com.example.japanesefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class foodActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food2)

        val myListData2 =  mutableListOf<MyData2>()

        myListData2.add(MyData2 (R.drawable.img14,"Макидзуси ","наиболее привычный иностранцам вид суши, который за пределами Японии называют роллами. Блюдо подается в форме разрезанного на 6 или 8 частей цилиндра из листа нори (сухих водорослей), покрывающего собой рис и начинку"))
        myListData2.add(MyData2 (R.drawable.img15,"Футомаки","отличаются от макидзуси большим размером и несколькими видами начинок, которые комбинируют для дополнительного вкуса и красивой расцветки."))
        myListData2.add(MyData2 (R.drawable.img16,"Гункан-маки","имеют овальную форму, снаружи обрамлены полоской водорослей, а начинка выкладывается сверх"))
        myListData2.add(MyData2 (R.drawable.img17,"Тирасидзуси (чираши суши или барадзуси)","тарелка с рисом и различными начинками"))
        myListData2.add(MyData2 (R.drawable.img18,"Нигири","кусочки сырой рыбы или креветки, поданные на плотной рисовой подушке"))
        myListData2.add(MyData2 (R.drawable.img19,"Урамаки","ролл маки рисом «наизнанку»"))
        myListData2.add(MyData2 (R.drawable.img20,"Темаки","конус, вручную свернутый из нори, в котором подаются рис и остальные ингредиенты"))
        myListData2.add(MyData2 (R.drawable.img21,"Осидзуси"," суши в виде прессованных брусочков, сделанные с помощью деревянного приспособления осибако"))
        myListData2.add(MyData2 (R.drawable.img22,"Инаридзуси","мешочки из жареного во фритюре тофу, тонкого омлета или засушенной тыквы, которые обычно заполняют только рисом"))
        myListData2.add(MyData2 (R.drawable.img23,"Нарэдзуси","древний способ приготовления блюда путем многомесячной ферментации рыбы и риса"))
        myListData2.add(MyData2 (R.drawable.img24,"Сашими","Многие иностранцы, заказывая это блюдо в ресторанах Японии, ожидают, что им предложат красиво оформленные слайсы рыбы. На самом деле термин сашими относится к любой тонко нарезанной сырой пище. Помимо рыбы и морепродуктов, это могут быть говядина (гюсаши), оленина (шикасаши), курица (торисаши) и конина (басаши)"))
        myListData2.add(MyData2 (R.drawable.img25,"Онигири","Второе название этого любимого японцами завтрака или перекуса — омусуби. Оно представляет собой рисовые шарики с самыми разнообразными начинками — от овощей до мяса и морепродуктов. В Токио, например, популярны онигири с маринованной сливой умэбоси, обладающей специфическим кисло-соленым вкусом"))
        myListData2.add(MyData2 (R.drawable.img26,"Темпару","Еще одно культовое японское блюдо представляет собой свежие креветки, рыбу и овощи, приготовленные во фритюре и покрытые нежнейшим хрустящим кляром из яйца, ледяной воды и муки, взбитых до состояния воздушных пузырьков. Попадая в кипящее масло, он расцветает, как цветок (по-японски — хана). Поэтому такой метод приготовления называется ханааге"))
        myListData2.add(MyData2 (R.drawable.img27,"Якитори","Куриные шашлычки на бамбуковых шпажках, запеченные на углях — одна из самых любимых у японцев закусок к алкоголю и просто идеальный вариант для посиделок с друзьями или коллегами. Поэтому якитори продаются в любом изакая"))
        myListData2.add(MyData2 (R.drawable.img28,"Окономияки","Сытный и недорогой перекус, который любят и сами японцы, и гости страны, представляет собой лепешку, жареную на теппане (горячей металлической плите). Тесто для нее состоит из тертой капусты, муки, яиц и небольшого количества бульона даси. В классическом варианте приготовления лепешку хорошо пропитывают специальным соусом и посыпают стружкой из сушеного тунца или измельченными водорослями аонори. В качестве дополнений можно выбрать любой ингредиент — свинину, морепродукты, говядину или овощи. Технологии приготовления и виды начинки изменяются от города к городу"))
        myListData2.add(MyData2 (R.drawable.img29,"Карааги","Это слово означает не название блюда, а кулинарную технику, когда маринованные продукты покрывают мукой или крахмалом и готовят во фритюре. Но сами японцы, заказывая карааге, чаще всего подразумевают курицу, порубленную небольшими кусочками и зажаренную до приятного хруста. Это одна из самых популярных закусок к пиву, которую предлагают во многих изакая"))
        myListData2.add(MyData2 (R.drawable.img30,"Такояки","Одна из самых популярных у японцев закусок представлена в виде шариков из нежного теста с вареным осьминогом, кусочками темпуры, зеленым луком и маринованным имбирем внутри. Их жарят в кафе и уличных палатках с помощью специальной сковороды с полусферическими углублениями. Готовое блюдо покрывают ароматным соусом такояки и японским майонезом тамаго-но-моно, а сверху посыпают водорослями аонори и стружкой из тунца"))
        myListData2.add(MyData2 (R.drawable.img31,"Гёдза","Изделие из тончайшего теста в форме полумесяца. В качестве начинок могут использоваться мясо с овощами, приправленное луком и чесноком, морепродукты и даже фрукты. В зависимости от способа термической обработки, различают яки-гёдза (обжаренные в небольшом количестве масла с добавлением воды), агэ-гёдза (жаренные во фритюре), суй-гёдза (вареные), муси-гёдза (приготовленные на пару)"))

        val myListView = findViewById<ListView>(R.id.my_list_view)
        myListView.adapter = MyCustomAdapter2(this, myListData2)



    }
}