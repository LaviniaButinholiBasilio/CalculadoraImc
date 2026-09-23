package calcularImc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Pessoa;

class PessoaTest {
    Pessoa pessoa;

    @Test
    void deveClassificarPessoaAbaixoDoPesoFeminino() {
        Pessoa pessoa = new Pessoa(54.91, 1.70, "F");

        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaNoPesoNormalFeminino() {
        Pessoa pessoa = new Pessoa(55.20, 1.70, "F");

        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaMarginalmenteAcimaDoPeso() {
        Pessoa pessoa = new Pessoa(74.57, 1.70, "F");

        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaAcimaDoPesoIdeal() {
        Pessoa pessoa = new Pessoa(78.90, 1.70, "F");

        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaObesaFeminino() {
        Pessoa pessoa = new Pessoa(93.35, 1.70, "F");

        assertEquals("obesa", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaAbaixoDoPesoMasculino() {
        Pessoa pessoa = new Pessoa(59.63, 1.70, "M");

        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaNoPesoNormalMAsculino() {
        Pessoa pessoa = new Pessoa(59.83, 1.70, "M");

        assertEquals("no peso normal", pessoa.calcularImc());
    }
    @Test
    void deveClassificarPessoaNoPesoNormal() {
        Pessoa pessoa = new Pessoa(76.29, 1.70, "M");

        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaMarginalmenteAcimaDoPesoMasculino() {
        Pessoa pessoa = new Pessoa(76.30, 1.70, "M");

        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaAcimaDoPesoMAsculino() {
        Pessoa pessoa = new Pessoa(80.35, 1.70, "M");

        assertEquals("acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveClassificarPessoaObesoMasculino() {
        Pessoa pessoa = new Pessoa(89.88, 1.70, "M");

        assertEquals("obeso", pessoa.calcularImc());
    }
}