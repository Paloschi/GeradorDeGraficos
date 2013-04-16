
import graph.GraficoBarrasJFX;
import graph.GraficoPizzaJFX;
import graph.GraficoSpiderJFX;
import graph.GraphJFX;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metaData.MetaDataGraph;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * *********************************************************************
 * Module: JGraphApp.java Author: Paloschi Purpose: Defines the Class JGraphApp
 **********************************************************************
 */
/**
 * @pdOid c5cde055-7885-4062-af2b-db9b38e02348
 */
public class JGraphApp {

    /**
     * @pdRoleInfo migr=no name=MetaDataGraphFactory assc=association1 mult=1..1
     */
    public static MetaDataGraphFactory metaDataGraphFactory;
    /**
     * @pdRoleInfo migr=no name=GraphFactory assc=association2 mult=1..1
     */
    public static GraphFactory graphFactory;
    /**
     * @pdRoleInfo migr=no name=InterfaceController assc=association3 mult=1..1
     */
    public static InterfaceController interfaceController;

    public static void main(String[] args) {
        try {
            final Options options = defineOptions();
            final CommandLineParser parser = new GnuParser();
            CommandLine cmd = parser.parse(options, args);

            cmd = parser.parse(options, args);


            if (args.length < 1) {
                printHelp(options);
            } else {
                parseOptions(cmd);
            }
        } catch (ParseException ex) {
            Logger.getLogger(JGraphApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Options defineOptions() {
        Options options = new Options();
        Option path = OptionBuilder.withLongOpt("path").hasArg(true).isRequired().withDescription("Especifique o diretorio do arquivo").create("p");
        options.addOption(path);
        Option type = OptionBuilder.withLongOpt("type").hasArg(true).isRequired().withDescription("Especifique o tipo do arquivo").create("t");
        options.addOption(type);
        Option graph = OptionBuilder.withLongOpt("graph").hasArg(true).isRequired().withDescription("Especifique o tipo do grafico").create("g");
        options.addOption(graph);
        return options;
    }

    public static void printHelp(final Options options) {
        final String cmdLineSyntax = "java -cp GeradorDeGraficoProject.jar";
        final HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.printHelp(cmdLineSyntax, options);
    }

    private static void parseOptions(CommandLine cmd) {
        try {
            String path = null;
            String type = null;
            String graph = null;

            if (cmd.hasOption("path")) {
                path = cmd.getOptionValue("path");
            }
            if (cmd.hasOption("type")) {
                type = cmd.getOptionValue("type");
            }
            if (cmd.hasOption("graph")) {
                graph = cmd.getOptionValue("graph");
            }

            path = path.trim();
            System.out.println(path);
            System.out.println("tipo :" + type);
            type = type.trim();
            type = type.toUpperCase();
            System.out.println("tipo :" + type);
            System.out.println("cheguei aqui");
            graph = graph.trim();
            graph = graph.toUpperCase();
            System.out.println("graph " + graph);


            metaDataGraphFactory = new MetaDataGraphFactory();
            MetaDataGraph mdg = metaDataGraphFactory.build(type);
           
            mdg.generateData(path);
            
            graphFactory = new GraphFactory();
            GraphJFX graphJFX = graphFactory.build(graph);
     

            graphJFX.generateGraph(mdg);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JGraphApp.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}