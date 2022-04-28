package me.elb1to.login_ui.dialogs;

public enum DialogTypeEnum {

    SUCCESSFUL_LOGIN(new Alert("Logueo Exitoso!")),
    WRONG_CREDENTIALS(new Alert("Usuario o contraseña invalido.")),
    OPTIONS_NOT_SELECTED(new Alert("Seleccione una opcion.")),
    IN_DEVELOPMENT(new Alert("No disponible"));

    private final Alert alert;

    DialogTypeEnum(Alert alert) {
        this.alert = alert;
    }

    public Alert getAlert() {
        return alert;
    }
}
