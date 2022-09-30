package com.example.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nubankclone.adapter.AdapterPayment
import com.example.nubankclone.databinding.ActivityMainBinding
import com.example.nubankclone.model.Payment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPayment: AdapterPayment
    private val listPayment: MutableList<Payment> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerIconsPayment = binding.recyclerIconsPayment
        recyclerIconsPayment.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIconsPayment.setHasFixedSize(true)
        adapterPayment = AdapterPayment(this, listPayment)
        recyclerIconsPayment.adapter = adapterPayment
        listIconsPayment()

    }

    private fun listIconsPayment () {
        val icon1 = Payment(R.drawable.ic_pix, getString(R.string.title_pix))
        listPayment.add(icon1)

        val icon2 = Payment(R.drawable.barcode,getString(R.string.title_payment))
        listPayment.add(icon2)

        val icon3 = Payment(R.drawable.emprestimo,getString(R.string.title_borrow))
        listPayment.add(icon3)

        val icon4 = Payment(R.drawable.transferencia,getString(R.string.title_transfer))
        listPayment.add(icon4)

        val icon5 = Payment(R.drawable.depositar,getString(R.string.title_deposit))
        listPayment.add(icon5)

        val icon6 = Payment(R.drawable.ic_recharg_phone,getString(R.string.title_recharg_phone))
        listPayment.add(icon6)

        val icon7 = Payment(R.drawable.ic_demand,getString(R.string.title_demand))
        listPayment.add(icon7)

        val icon8 = Payment(R.drawable.doacao,getString(R.string.title_donation))
        listPayment.add(icon8)
    }
}