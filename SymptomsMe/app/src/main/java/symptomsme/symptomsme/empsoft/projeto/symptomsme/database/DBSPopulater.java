package symptomsme.symptomsme.empsoft.projeto.symptomsme.database;

/**
 * Created by Wesley Brenno on 14/05/2016.
 */


import android.content.Context;
import android.util.Log;

import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Doenca;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Medico;

// TODO: Auto-generated Javadoc

/**
 * The Class DBSPopulater.
 */
public class DBSPopulater {

    /**
     * The m db.
     */
    private static DataBaseStorage mDb;

    /**
     * Instantiates a new DBS populater.
     *
     * @param context the context
     */
    public DBSPopulater(Context context) {
        mDb = new DataBaseStorage(context);
    }

    /**
     * Populate bd.
     */
    public static void populateBD() {

        Doenca pneumonia = new Doenca(1, "Pneumonia", "Febre alta, Tosse, Dor no tórax, Alterações da pressão arterial, Confusão mental, Mal-estar generalizado, Falta de ar, Secreção de muco purulento de cor amarelada ou esverdeada, Toxemia (danos provocados pelas toxinas carregadas pelo sangue), Prostração (fraqueza)", "Pneumonia é uma infecção que se instala nos pulmões (órgão duplo localizado um de cada lado da caixa torácica). Pode acometer a região dos alvéolos pulmonares onde desembocam as ramificações terminais dos brônquios e, às vezes, os interstícios (espaço entre um alvéolo e outro).", "Basicamente, pneumonias são provocadas pela penetração de um agente infeccioso ou irritante (bactérias, vírus, fungos e por reações alérgicas) no espaço alveolar, onde ocorre a troca gasosa. Esse local deve estar sempre muito limpo, livre de substâncias que possam impedir o contato do ar com o sangue.Diferentes do vírus da gripe, que é uma doença altamente infectante, os agentes infecciosos da pneumonia não costumam ser transmitidos facilmente.", "Lave as mãos com frequência, principalmente após: Assoar o nariz, ir ao banheiro, trocar fraldas. Também lave suas mãos antes de comer ou preparar alimentos. Não fume. O fumo prejudica a capacidade dos pulmões de evitar a infecção. As vacinas podem ajudar a prevenir a pneumonia em crianças, idosos ou pessoas com diabetes, asma, enfisema, HIV, câncer ou outras condições com efeitos a longo prazo.", "Pneumologista");
        Doenca gripe = new Doenca(2, "Gripe", "Febre,Dor de cabeça, vermelhidão no rosto, dores no corpo,cansaço, dor muscular, dor de garganta, tosse seca", "A gripe é uma infecção do sistema respiratório cuja principal complicação é a pneumonia, responsável por um grande número de internações hospitalares no país. A gripe inicia-se com febre alta, em geral acima de 38ºC, seguida de dor muscular, dor de garganta, dor de cabeça e tosse seca", "A gripe é causada pelo vírus influenza", "A vacina da gripe é a melhor maneira de evitar a gripe e suas complicações", "Pneumologista");
        Doenca gripeH1N1 = new Doenca(3, "Gripe H1N1", "Febre alta, Tosse, Dor de cabeça, Dores musculares, Falta de ar, Espirros, Dor de garganta, Fraqueza, Coriza, Congestão nasal, Náuseas e vômitos, Diarreia", "A gripe H1N1 consiste em uma doença causada por uma mutação do vírus da gripe. Também conhecida como gripe Influenza tipo A ou gripe suína, ela se tornou conhecida quando afetou grande parte da população mundial entre 2009 e 2010.", "As primeiras formas do vírus H1N1 foram descobertas em porcos, mas as mutações conseguintes o tornaram uma ameaça também aos seres humanos. Como todo vírus considerado novo, para o qual não costumam existir métodos preventivos, o vírus mutante da gripe H1N1 espalhou-se rapidamente pelo mundo.", "A vacina da gripe é a melhor maneira de evitar a gripe e suas complicações", "Pneumologista");
        Doenca dengue = new Doenca(4, "Dengue", "Febre alta com início súbito (39° a 40°C), Forte dor de cabeça, Dor atrás dos olhos, Perda do paladar e apetite, manchas e erupções na pele, Náuseas e Võmitos, Tontura, Extremo cansaço, Moleza e dor no corpo, muitas dores nos ossos e articulações, dor abdominal", "A dengue é uma doença febril aguda causada por um vírus, sendo um dos principais problemas de saúde pública no mundo. O seu principal vetor de transmissão é o mosquito Aedes aegypti, que se desenvolve em áreas tropicais e subtropicais.", "A dengue não é transmitida de pessoa para pessoa. A transmissão se dá pelo mosquito que, após um período de 10 a 14 dias contados depois de picar alguém contaminado, pode transportar o vírus da dengue durante toda a sua vida.", "O mosquito Aedes aegypti é o transmissor do vírus e suas larvas nascem e se criam em água parada. Por isso, evitar esses focos da reprodução desse vetor é a melhor forma de prevenir a dengue!", "Infectologista");
        Doenca zika = new Doenca(5, "Zika", "Febre, Dor de cabeça, Dor de nas articulações, Dor muscular, Erupções cutãneas, Conjutivite", "Zika Vírus é uma infecção causada pelo vírus ZIKV, transmitida pelo mosquito Aedes aegypti, mesmo transmissor da dengue e da febre chikungunya. O vírus Zika teve sua primeira aparição registrada em 1947, quando foi encontrado em macacos da Floresta Zika, em Uganda. Entretanto, somente em 1954 os primeiros seres humanos foram contaminados, na Nigéria. O vírus Zika atingiu a Oceania em 2007 e a França no ano de 2013. O Brasil notificou os primeiros casos de Zika vírus em 2015, no Rio Grande do Norte e na Bahia.", "O contágio do vírus ZIKV se dá pelo mosquito que, após picar alguém contaminado, pode transportar o ZIKV durante toda a sua vida, transmitindo a doença para uma população que não possui anticorpos contra ele.", "O mosquito Aedes aegypti é o transmissor do vírus e suas larvas nascem e se criam em água parada. Por isso, evitar esses focos da reprodução desse vetor é a melhor forma de se prevenir contra o Zika vírus.", "Infectologista");
        Doenca febreChikungunya = new Doenca(6, "Febre Chinkunguya", "Febre, Dor nas articulações, Dor nas costas, Dor de cabeça, Erupções cutâneas, Fadiga, Náuseas, Vômitos, Mialgias", "Febre Chikungunya é uma doença parecida com a dengue, causada pelo vírus CHIKV, da família Togaviridae. Seu modo de transmissão é pela picada do mosquito Aedes aegypti infectado e, menos comumente, pelo mosquito Aedes albopictus.", "A febre chikugunya não é transmitida de pessoa para pessoa. O contágio se dá pelo mosquito que, após um período de sete dias contados depois de picar alguém contaminado, pode transportar o vírus CHIKV durante toda a sua vida, transmitindo a doença para uma população que não possui anticorpos contra ele. Por isso, o objetivo é estar atento para bloquear a transmissão tão logo apareçam os primeiros casos.", "O mosquito Aedes aegypti é o transmissor do vírus e suas larvas nascem e se criam em água parada. Por isso, evitar esses focos da reprodução desse vetor é a melhor forma de prevenir a febre chikungunya! ", "Infectologista");
        Doenca hepatite = new Doenca(7, "Hepatite", "Febre,Dores de cabeça, vermelhidão no rosto, dores no corpo,cansaço", "Hepatite designa qualquer degeneração do fígado por causas diversas, sendo as mais frequentes as infecções pelos vírus tipo A, B e C e o abuso do consumo de álcool ou outras substâncias tóxicas (como alguns remédios). Enquanto os vírus atacam o fígado quando parasitam suas células para a sua reprodução, a cirrose dos alcoólatras é causada pela ingestão frequente de bebidas alcoólicas - uma vez no organismo, o álcool é transformado em ácidos nocivos às células hepáticas, levando à hepatite.", "", "A melhor estratégia de prevenção da hepatite A inclui a melhoria das condições de vida, com adequação do saneamento básico e medidas educacionais de higiene. A vacina específica contra o vírus A está indicada conforme preconizado pelo Programa Nacional de Imunizações (PNI)", "Hepatologista");
        Doenca tuberculose = new Doenca(10, "Tuberculose", "","A tuberculose é uma doença infecto-contagiosa causada por uma bactéria que afeta principalmente os pulmões, mas também pode ocorrer em outros órgãos do corpo, como ossos, rins e meninges (membranas que envolvem o cérebro).", "A tuberculose no geral é causada por uma infecção por Mycobacterium tuberculosis ou Bacilo de Koch (BK). Outras espécies de micobactérias também podem causar a tuberculose. São elas: Mycobacterium bovis, africanum e microti. A transmissão da tuberculose é direta, de pessoa a pessoa, portanto, a aglomeração de pessoas é o principal fator de transmissão. A pessoa com tuberculose expele, ao falar, espirrar ou tossir, pequenas gotas de saliva que contêm o agente infeccioso e podem ser aspiradas por outro indivíduo contaminando-o. Má alimentação, falta de higiene, tabagismo, alcoolismo ou qualquer outro fator que gere baixa resistência orgânica, também favorece o estabelecimento da tuberculose.", "Para prevenir a tuberculose é necessário imunizar as crianças com a vacina BCG. Crianças soropositivas ou recém-nascidas que apresentam sinais ou sintomas de Aids não devem receber a vacina. A prevenção da tuberculose inclui evitar aglomerações, especialmente em ambientes fechados, e não utilizar objetos de pessoas contaminadas.", "Pneumologista");

        mDb.addDoenca(pneumonia);
        mDb.addDoenca(gripe);
        mDb.addDoenca(gripeH1N1);
        mDb.addDoenca(dengue);
        mDb.addDoenca(zika);
        mDb.addDoenca(febreChikungunya);
        mDb.addDoenca(hepatite);
        mDb.addDoenca(tuberculose);

        Medico medicoJoao = new Medico(1,"João Pedro", "Neuro", "Rua João Pessoa", "9999-0000", "um link ai");


        Medico medicoJose = new Medico(1,"José", "Otorrino", "Rua João Pessoa", "9999-0000", "um link ai");


        Medico medicoDouglas = new Medico(1,"Douglas", "Pediatra", "Rua João Pessoa", "9999-0000", "um link ai");

        mDb.addMedico(medicoDouglas);
        mDb.addMedico(medicoJoao);
        mDb.addMedico(medicoJose);

        String[] sintomas1 = {"febre","dores de cabeça","cansaço"};
        String[] sintomas2 = {"enjoo"};


        Log.d("Quantidade de médicos", String.valueOf(mDb.getAllMedicos().size()));

        Log.d("Quantidade de pediatras", String.valueOf(mDb.getMedicoByEspecialidade("Pediatra").size()));

        Log.d("Médico João", mDb.getMedicoByEspecialidade("Neuro").get(0).getNome());
        Log.d("Médico José", mDb.getMedicoByEspecialidade("Otorrino").get(0).getNome());
        Log.d("Médico Douglas", mDb.getMedicoByEspecialidade("pediatra").get(0).getNome());

        Log.d("Gripe", mDb.getDoencasBySintomas(sintomas1).get(0).getName());

        Log.d("Quantidades de doenças", String.valueOf(mDb.getDoencasBySintomas(sintomas1).size()));

        Log.d("Quantidades de doenças", String.valueOf(mDb.getDoencasBySintomas(sintomas2).size()));

        Log.d("Quantidades de doenças", String.valueOf(mDb.getAllDoencas().size()));
    }
}