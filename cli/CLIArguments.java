package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;


public class CLIArguments {
    CLIArguments() {

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",

            validateWith = CLIKeywordValidator.class,
            description = "KEYWORKD"
    )

    private String keyword;

    @Parameter(
            names={"--location","-l"},
            description= "Cada busqueda puede incluir ubicación"
    )
    private String location;

    @Parameter(
            names = {"--page","-p"},
            description = "La API devuelve 50 resultados"
    )
    private int page=0;

    @Parameter(
            names = {"--full-time"},
            description = "Agregar si queremos trabajos de tiempo completo"
    )

    private boolean isFullTime =false;

    @Parameter(
            names="--markdown",
            description = "obtener  resultados en markdown"
    )
    private boolean isMarkDown=false;

    @Parameter(
            names = "--help",
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Mostrar Ayuda"
    )

    private boolean isHelp;




    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
