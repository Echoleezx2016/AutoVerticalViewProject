# AutoVerticalViewProject
How to
To get a Git project into your build:
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  Step 2. Add the dependency：
  	dependencies {
		compile 'com.github.User:Repo:Tag'
	}
  use:
  xml
    <com.lzx.autoverticalviewproject.utils.AutoVerticalViewView
        android:id="@+id/tb"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="15dp"
        android:gravity="center_vertical"/>
    javacodes
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoVerticalViewView = (AutoVerticalViewView) findViewById(R.id.tb);
        final List<AutoVerticalViewDataData> data = new ArrayList<AutoVerticalViewDataData>();
        data.add(new AutoVerticalViewDataData("疯传", "不动产统一登记年底全国联网 可以“以人查房”吗？", "1"));
        data.add(new AutoVerticalViewDataData("头条", "男科医院聘美女主播直播招揽病人 当地介入调查", "2"));
        data.add(new AutoVerticalViewDataData("热议", "年轻人专属 15万内高人气两厢家用车推荐", "3"));
        data.add(new AutoVerticalViewDataData("哈哈", "韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑,韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑", "4"));
        data.add(new AutoVerticalViewDataData("呵呵", "特朗普任内对朝采取军事行动？ 美或为此付出代价", "5"));
        autoVerticalViewView.setViews(data);
        autoVerticalViewView.setOnItemClickListener(new AutoVerticalViewView.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "你点击了" + data.get(position).getValue(), Toast.LENGTH_SHORT).show();
            }
        });
    }
