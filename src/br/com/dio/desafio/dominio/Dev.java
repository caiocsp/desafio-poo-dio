package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluídos = new LinkedHashSet<>();

    public void InscreverBootcamp(Bootcamp bootcamp){
        //Assim que sou inscrito em um Bootcamp, já terei conteúdos inscritos (Set<Conteudo> conteudosInscritos)
        
    }

    public void progredir() {
        // Assim que progredir nos conteudos, automaticamente serão inclusos os conteúdos concluídos (Set<Conteudo> conteudosConcluídos)

    }

    public void calcularTotalXP() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluídos() {
        return conteudosConcluídos;
    }

    public void setConteudosConcluídos(Set<Conteudo> conteudosConcluídos) {
        this.conteudosConcluídos = conteudosConcluídos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conteudosConcluídos == null) ? 0 : conteudosConcluídos.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Dev other = (Dev) obj;
        if (conteudosConcluídos == null) {
            if (other.conteudosConcluídos != null)
                return false;
        } else if (!conteudosConcluídos.equals(other.conteudosConcluídos))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    
}
