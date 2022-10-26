# SpecialCase
Implementation of pattern Special Case for Android net response.

How use:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
    
    
	}
  
  	dependencies {
	        implementation 'com.github.AntonButov:SpecialCase:1.0.0'
	}


Sample

class MainActivity : AppCompatActivity() {

    private val viewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            viewModel.getData().also { uiModel ->
                val tvFirst = findViewById<TextView>(R.id.tvFirst)
                tvFirst.set(uiModel.title)
                val tvSecond = findViewById<TextView>(R.id.tvSecond)
                tvSecond.set(uiModel.count)
            }
    }


