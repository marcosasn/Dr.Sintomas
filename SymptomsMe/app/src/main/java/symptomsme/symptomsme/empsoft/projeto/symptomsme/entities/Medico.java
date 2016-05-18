package symptomsme.symptomsme.empsoft.projeto.symptomsme.entities;

import java.io.Serializable;

/**
 * Created by Wesley Brenno on 14/05/2016.
 */
public class Medico implements Serializable {

    private long id;
    private String nome;
    private String especialidade;
    private String endereco;
    private String telefone;
    private String maps;

    public Medico(long id, String nome, String especialidade, String endereco, String telefone, String maps) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.maps = maps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }
}
