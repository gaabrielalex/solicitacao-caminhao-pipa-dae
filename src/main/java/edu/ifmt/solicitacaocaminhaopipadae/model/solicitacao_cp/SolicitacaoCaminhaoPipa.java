package edu.ifmt.solicitacaocaminhaopipadae.model.solicitacao_cp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;

@Entity
public class SolicitacaoCaminhaoPipa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 100)
    private String nomeSolicitante;

    @Column(length = 14)
    private String cpf;

    @Column(length = 15)
    private String telefone;

    @Column(length = 200)
    private String endereco;

    @Column(length = 400)
    private String descricaoProblema;

    private double litrosAguaSolicitado;

    @Enumerated(EnumType.STRING)
    private NivelUrgencia nivelUrgencia;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dataEntrega;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date horaEntrega;

    public Long getCodigo() {
        return codigo;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public double getLitrosAguaSolicitado() {
        return litrosAguaSolicitado;
    }

    public void setLitrosAguaSolicitado(double litrosAguaSolicitado) {
        this.litrosAguaSolicitado = litrosAguaSolicitado;
    }

    public NivelUrgencia getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Date horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SolicitacaoCaminhaoPipa other = (SolicitacaoCaminhaoPipa) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SolicitacaoCaminhaoPipa [codigo=" + codigo + ", nomeSolicitante=" + nomeSolicitante + ", cpf=" + cpf
                + ", telefone=" + telefone + ", endereco=" + endereco + ", descricaoProblema=" + descricaoProblema
                + ", litrosAguaSolicitado=" + litrosAguaSolicitado + ", nivelUrgencia=" + nivelUrgencia
                + ", dataEntrega=" + dataEntrega + ", horaEntrega=" + horaEntrega + "]";
    }
    
    public boolean isAlto() {
        return NivelUrgencia.ALTO.equals(this.nivelUrgencia);
    }

    public boolean isMedio() {
        return NivelUrgencia.MEDIO.equals(this.nivelUrgencia);
    }

    public boolean isBaixo() {
        return NivelUrgencia.BAIXO.equals(this.nivelUrgencia);
    }

    public boolean isNenhum() {
        return NivelUrgencia.NENHUM.equals(this.nivelUrgencia);
    }
}
