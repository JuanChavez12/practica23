
package practica23;

/**
 *
 * @author 18progb0404
 */
public class libro {
    private String titulo;
    private String autor;
    private int ejemplaresenexistenxia;
    private int ejeplaresprestados;
    
    // crear los contructores

    public libro() {
    }

    public libro(String titulo, String autor, int ejemplaresenexistenxia, int ejeplaresprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresenexistenxia = ejemplaresenexistenxia;
        this.ejeplaresprestados = ejeplaresprestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresenexistenxia() {
        return ejemplaresenexistenxia;
    }

    public void setEjemplaresenexistenxia(int ejemplaresenexistenxia) {
        this.ejemplaresenexistenxia = ejemplaresenexistenxia;
    }

    public int getEjeplaresprestados() {
        return ejeplaresprestados;
    }

    public void setEjeplaresprestados(int ejeplaresprestados) {
        this.ejeplaresprestados = ejeplaresprestados;
    }

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplaresenexistenxia=" + ejemplaresenexistenxia + ", ejeplaresprestados=" + ejeplaresprestados + '}';
    }
    
    
}
