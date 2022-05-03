package me.elb1to.login_ui.dialogs;

import lombok.Getter;

public enum DialogTypeEnum {

    SUCCESSFUL_LOGIN(new Alert("Logueo Exitoso!")),
    WRONG_CREDENTIALS(new Alert("Usuario o contraseña invalido.")),
    OPTIONS_NOT_SELECTED(new Alert("Seleccione una opcion.")),
    IN_DEVELOPMENT(new Alert("No disponible"));

    @Getter private final Alert alert;

    DialogTypeEnum(Alert alert) {
        this.alert = alert;
    }
}
