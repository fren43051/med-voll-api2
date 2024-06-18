package clinic.voll.api.domain.medico;

import clinic.voll.api.domain.direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarMedico(@NotNull long id, String nombre, String documento, DatosDireccion direccion) {
}
