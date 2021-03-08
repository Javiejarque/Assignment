package com.example.assignment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class UserActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
    val actionBar = supportActionBar

    actionBar!!.title = "User info"
        actionBar.setDisplayHomeAsUpEnabled(true)

}


}
