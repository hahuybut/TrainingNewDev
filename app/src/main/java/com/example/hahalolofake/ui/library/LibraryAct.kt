package com.example.hahalolofake.ui.library

import android.content.Intent
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hahalolofake.R
import com.example.hahalolofake.base.AbsActivity
import com.example.hahalolofake.databinding.ActivityLibraryBinding
import com.example.hahalolofake.ui.library.adapter.LibraryAdapter
import com.example.hahalolofake.ui.main.MainActivity
import javax.inject.Inject

class LibraryAct @Inject constructor() : AbsActivity<ActivityLibraryBinding>() {

    override fun initView() {
        val spanCount = 3
        binding.rcvLibrary.layoutManager = GridLayoutManager(this, spanCount)
        binding.rcvLibrary.adapter = LibraryAdapter(LibraryAdapter.dummyData)
    }

    override fun initAction() {
        binding.backBtn.setOnClickListener {
            val intent = Intent(this@LibraryAct, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding
    }

    override fun getContentView(): Int {
        return R.layout.activity_library
    }

    override fun bindViewModel() {
    }
}