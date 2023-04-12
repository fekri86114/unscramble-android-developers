### unscramble-android-developers
This application is for Android Developers Codelabs. Click 
[here](https://developer.android.com/codelabs/basic-android-kotlin-training-viewmodel?authuser=1#0) to Start!

---
*Attention!*
* in `GameFragment` use 

      private val viewModel: GameViewModel by lazy {
          ViewModelProvider(this)[GameViewModel::class.java]
      }

*instead of* 
      
    private val viewModel: GameViewModel by viewModels()
