package br.com.marco.aula8.ExemploAula8;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
public class ServicoContoller {
    private Map<Integer, Servico> servicos = new TreeMap<>();

    public ServicoContoller(){
        Servico s1 = new Servico();
        s1.setId(1);
        s1.setNome("Cafe");
        s1.setValor(4.5f);
        servicos.put(s1.getId(),s1);

        Servico s2 = new Servico();
        s2.setId(2);
        s2.setNome("Agua");
        s2.setValor(4.5f);
        servicos.put(s2.getId(),s2);

    }






    @GetMapping("/servico")
    public List<Servico> listar(){
        return new ArrayList(servicos.values());

    }
    @GetMapping("/servico/{id}")
    public Servico obter(@PathVariable int id){
        return servicos.get(id);

    }
    @PostMapping("/servico")
        Servico novoServico(@RequestBody Servico newServico){
        return servicos.put(newServico.getId(),newServico);

    }

    @DeleteMapping("/servico/{id}")
    void deleteServico(@PathVariable Integer id) {
        servicos.remove(id);
    }
}
