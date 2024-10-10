package br.unipar.taffebank

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class TransacaoAdapter(private val context: Context, private val transacoes: List<Transacao>) : RecyclerView.Adapter<TransacaoAdapter.ViewHolder>() {


                            class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                                val  tvDescricao: TextView = itemView.findViewById(R.id.tvDescricao)
                                val tvTipo: TextView = itemView.findViewById(R.id.tvTipo)
                                val  tvValor: TextView = itemView.findViewById(R.id.tvValor)


                            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransacaoAdapter.ViewHolder {
        //busca o layout que vai ser inflado para o novo item
        val view = LayoutInflater.from(context).inflate((R.layout.item_layout_transacao, parent, false)
        return ViewHolder(view) // Retorna o layout que vai ser carregado
    }

    override fun getItemCount(): Int {
        return transacoes.size
    }

    //Metodo chamado para ligar os dados com os itens da View
    override fun onBindViewHolder(holder: TransacaoAdapter.ViewHolder, position: Int) {

        val itemTransacao = transacoes[position]
        holder.tvDescricao.text = itemTransacao.descricao
        holder.tvValor.text = String.format("R$ %2.f", itemTransacao.valor)
        holder.tvTipo.text = itemTransacao.tipo

    }
}