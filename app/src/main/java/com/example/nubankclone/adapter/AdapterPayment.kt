package com.example.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nubankclone.databinding.PaymentItemBinding
import com.example.nubankclone.model.Payment

class AdapterPayment(private val context: Context, private val listPayment: MutableList<Payment>):
    RecyclerView.Adapter<AdapterPayment.PaymentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {
        val itemLista = PaymentItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return PaymentViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {
        holder.iconPayment.setBackgroundResource(listPayment[position].icon!!)
        holder.txtPaymentTitle.text = listPayment[position].title
    }

    override fun getItemCount() = listPayment.size

    inner class PaymentViewHolder(binding: PaymentItemBinding): RecyclerView.ViewHolder(binding.root) {
        val iconPayment = binding.icPayment
        val txtPaymentTitle = binding.txtPaymentTitle
    }

}