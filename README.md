# AutoVerticalViewProject
##How to<br>
	To get a Git project into your build:<br>
	Step 1. Add the JitPack repository to your build file<br>
	Add it in your root build.gradle at the end of repositories:<br>
	allprojects {<br>
		repositories {<br>
			...<br>
			maven { url 'https://jitpack.io' }<br>
		}<br>
	}<br>
  Step 2. Add the dependency：<br>
  	
dependencies {<br>
	        compile 'com.github.Echoleezx2016:AutoVerticalViewProject:v1.2'<br>
	}<br>
 ## xml<br>
    <com.lzx.autoverticalviewproject.utils.AutoVerticalViewView<br>
        android:id="@+id/tb"<br>
        android:layout_width="match_parent"<br>
        android:layout_height="wrap_content"<br>
        android:layout_marginLeft="15dp"<br>
        android:gravity="center_vertical"/><br>
   ##javacodes<br>
      @Override<br>
    protected void onCreate(Bundle savedInstanceState) {<br>
        super.onCreate(savedInstanceState);<br>
        setContentView(R.layout.activity_main);<br>
        autoVerticalViewView = (AutoVerticalViewView) findViewById(R.id.tb);<br>
        final List<AutoVerticalViewDataData> data = new ArrayList<AutoVerticalViewDataData>();<br>
        data.add(new AutoVerticalViewDataData("疯传", "不动产统一登记年底全国联网 可以“以人查房”吗？", "1"));<br>
        data.add(new AutoVerticalViewDataData("头条", "男科医院聘美女主播直播招揽病人 当地介入调查", "2"));<br>
        data.add(new AutoVerticalViewDataData("热议", "年轻人专属 15万内高人气两厢家用车推荐", "3"));<br>
        data.add(new AutoVerticalViewDataData("哈哈", "韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑,韩检方第4次看守所中讯问朴槿惠 集中调查受贿<br>嫌疑韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑", "4"));<br>
        data.add(new AutoVerticalViewDataData("呵呵", "特朗普任内对朝采取军事行动？ 美或为此付出代价", "5"));<br>
        autoVerticalViewView.setViews(data);<br>
        autoVerticalViewView.setOnItemClickListener(new AutoVerticalViewView.OnItemClickListener() {<br>
            @Override<br>
            public void onItemClick(int position) {<br>
                Toast.makeText(MainActivity.this, "你点击了" + data.get(position).getValue(), Toast.LENGTH_SHORT).show();<br>
            }<br>
        });<br>
    }<br>
