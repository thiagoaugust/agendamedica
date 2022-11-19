package med.voll.agendamedica.controller;

import jakarta.validation.Valid;
import med.voll.agendamedica.paciente.DadosPaciente;
import med.voll.agendamedica.paciente.Paciente;
import med.voll.agendamedica.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosPaciente dados){

        repository.save(new Paciente(dados));
    }
}
