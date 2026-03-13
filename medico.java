public class medico{
  public String nome;
  public String crm;
  public String telefone;
  public String especialidade;
  public String senha;
}
public Medico(){
}

  public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
    try {
      this.nome = nome;
      this.crm = crm;
      this.telefone = telefone;
      this.especialidade = especialidade;
      this.senha = senha;
    } catch (Exception e) {
      this.nome = "";
      this.crm = "";
      this.telefone = "";
      this.especialidade = "";
      this.senha = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    try {
      this.nome = nome;
    } catch (Exception e) {
      this.nome = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getCrm() {
    return crm;
  }

  public void setCrm(String crm) {
    try {
      this.crm = crm;
    } catch (Exception e) {
      this.crm = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos"); /*valores redefinidos*/
    }
  }

  public String getTelefone() {
