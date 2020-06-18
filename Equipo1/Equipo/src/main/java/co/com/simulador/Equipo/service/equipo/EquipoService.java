package co.com.simulador.Equipo.service.equipo;

import edu.torneo.simuladortorneo.command.EquipoCommand;
import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;

import java.util.List;

public interface EquipoService {

    String registrarEquipo(EquipoCommand equipoCommand) throws BusinessExecption;

    List<EquipoCommand> listAll();
}
