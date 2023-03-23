package com.appymize.coursegridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var gridView : GridView
    lateinit var courseList : List<GridViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        gridView = findViewById(R.id.gridView)
        courseList = ArrayList<GridViewModel>()

        courseList = courseList + GridViewModel("Java",R.drawable.java)
        courseList = courseList + GridViewModel("C++",R.drawable.cplus)
        courseList = courseList + GridViewModel("Python",R.drawable.python)
        courseList = courseList + GridViewModel("Java Script",R.drawable.javascript)
        courseList = courseList + GridViewModel("Android",R.drawable.android)
        courseList = courseList + GridViewModel("Java",R.drawable.java)
        courseList = courseList + GridViewModel("C++",R.drawable.cplus)
        courseList = courseList + GridViewModel("Python",R.drawable.python)
        courseList = courseList + GridViewModel("Java Script",R.drawable.javascript)
        courseList = courseList + GridViewModel("Android",R.drawable.android)
        courseList = courseList + GridViewModel("Java",R.drawable.java)
        courseList = courseList + GridViewModel("C++",R.drawable.cplus)
        courseList = courseList + GridViewModel("Python",R.drawable.python)
        courseList = courseList + GridViewModel("Java Script",R.drawable.javascript)
        courseList = courseList + GridViewModel("Android",R.drawable.android)
        courseList = courseList + GridViewModel("Java",R.drawable.java)
        courseList = courseList + GridViewModel("C++",R.drawable.cplus)
        courseList = courseList + GridViewModel("Python",R.drawable.python)
        courseList = courseList + GridViewModel("Java Script",R.drawable.javascript)
        courseList = courseList + GridViewModel("Android",R.drawable.android)


        val courseAdapter = Adaptar(courseList,this@MainActivity)

        gridView.adapter = courseAdapter

        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->

            Toast.makeText(applicationContext,courseList[position].courseName + " Selected",Toast.LENGTH_SHORT).show()

        }



    }
}