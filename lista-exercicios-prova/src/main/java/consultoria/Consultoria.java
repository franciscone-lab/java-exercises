package consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedor;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedor = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome){
        if (nome.equals(this.nome)){
            return true;
        } else {
            return false;
        }
    }
    
    public void contratar(Desenvolvedor d){
        if (desenvolvedor.size() < this.vagas){
            desenvolvedor.add(d);
            this.vagas--;
        } else{
            System.out.println("Sem vagas disponíveis!");
        }
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        return desenvolvedor.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        
        Integer qtdDesenvMobile = 0;
        
        for (Desenvolvedor desenvolvedores : desenvolvedor) {
            if (desenvolvedores instanceof DesenvolvedorMobile){
                qtdDesenvMobile++;
            }
        }
        
        return qtdDesenvMobile;
    }
    
    public Double getTotalSalarios(){
        Double salarios = 0.0;
        
        for (Desenvolvedor desenvolvedores : desenvolvedor) {
            salarios += desenvolvedores.getSalario();
        }
        
        return salarios;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        for (Desenvolvedor desenvolvedores : desenvolvedor) {
            if (nome.equals(desenvolvedores.getNome())){
                return desenvolvedores;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Desenvolvedor> getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(List<Desenvolvedor> desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    @Override
    public String toString() {
        return String.format("Nome Consultoria: %s\nVagas: %d", this.nome, this.vagas);
    }
}
