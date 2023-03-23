package com.appymize.coursegridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Adaptar (val courseList: List<GridViewModel> , val context : Context) : BaseAdapter() {

    var layoutInflater : LayoutInflater? = null
    lateinit var courseTV : TextView
    lateinit var courseIV : ImageView


    override fun getCount(): Int {
       return courseList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var convertView = convertView
        if (layoutInflater == null){
            layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null){

            convertView = layoutInflater!!.inflate(R.layout.gridview,null)

        }
        courseIV = convertView!!.findViewById(R.id.courseImg)
        courseTV = convertView.findViewById(R.id.courseTV)


        courseIV.setImageResource(courseList.get(position).courseImg)
        courseTV.text = courseList.get(position).courseName
        return convertView



    }


}