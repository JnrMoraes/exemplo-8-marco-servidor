package br.com.marco.aula8.ExemploAula8;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
public class VeiculoController {

        private Map<Integer, Veiculo> veiculos = new TreeMap<>();

        public VeiculoController(){
            Veiculo v1 = new Veiculo();
            v1.setId(1);
            v1.setPlaca("EEE-1221");
            v1.setCor("Verde");
            v1.setMarca("VW");
            v1.setNumPortas(5);
            v1.setPreco(21000.00f);
            v1.getIpva().add(1200.00f);
            v1.getIpva().add(1100.00f);
            v1.getIpva().add(1000.00f);
            v1.getIpva().add(900.00f);

            veiculos.put(v1.getId(), v1);

            Veiculo v2 = new Veiculo();
            v2.setId(2);
            v2.setPlaca("EEE-333");
            v2.setCor("azul");
            v2.setMarca("VW");
            v2.setNumPortas(5);
            v2.setPreco(55000.00f);
            v2.getIpva().add(1200.00f);
            v2.getIpva().add(1100.00f);
            v2.getIpva().add(1000.00f);
            v2.getIpva().add(900.00f);
            veiculos.put(v2.getId(), v2);
        }

        @GetMapping("/veiculo")
        public List<Veiculo> listar(){
            return new ArrayList(veiculos.values());
        }

        @GetMapping("/veiculo/{id}")
        public Veiculo obter(@PathVariable int id){
            return veiculos.get(id);

        }
        @PostMapping("/veiculo")
        Veiculo novoVeiculo(@RequestBody Veiculo newVeiculo){
            return veiculos.put(newVeiculo.getId(),newVeiculo);
        }

        @PutMapping("/veiculo")
        Veiculo atulaizarVeiculo(@RequestBody Veiculo veiculo){
            return veiculos.put(veiculo.getId(), veiculo);
        }

        @DeleteMapping("/veiculo/{id}")
        void deleteVeiculo(@PathVariable Integer id) {
            veiculos.remove(id);
        }
    }


