package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(40) // Culminación absoluta del modelo de gobierno corporativo
public class Seeder_40_MEA04 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_40_MEA04(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA04")) {
            System.out.println("Iniciando carga de datos de aseguramiento independiente: MEA04...");
            cargarMEA04();
            System.out.println("MEA04 (Gestión del Aseguramiento) cargado exitosamente. ¡Modelo COBIT 2019 completado!");
        }
    }

    private void cargarMEA04() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE AUDITORÍA Y VERDAD ABSOLUTA)
        // ==========================================
        ProcesoCobit mea04 = new ProcesoCobit();
        mea04.setIdProceso("MEA04");
        mea04.setDominio("Monitorizar, Evaluar y Valorar");
        mea04.setAreaPrioritaria("Modelo Core de COBIT");
        mea04.setNombreProceso("Gestionar el aseguramiento");
        mea04.setDescripcionProceso("Planificar, diseñar y ejecutar iniciativas de evaluación independiente para validar de manera objetiva que la infraestructura tecnológica, los controles de seguridad y los procesos operativos cumplen íntegramente con los estándares exigidos por la junta directiva y las normativas externas.");
        mea04.setPropositoProceso("Proporcionar a los inversores y a la alta dirección una garantía imparcial, basada exclusivamente en evidencias verificables, certificando que los sistemas de movilidad conectada y las redes comerciales operan bajo un entorno seguro, legal y financieramente transparente.");

        mea04.setMetasAlineamiento("AG01: Transparencia absoluta y fiabilidad comprobada sobre los costos operativos y los beneficios entregados.\nAG02: Gestión integral del riesgo garantizando la exactitud de los controles corporativos.");
        mea04.setMetasEmpresariales("EG04: Alta calidad, oportunidad y precisión irrefutable en la información gerencial generada.\nEG02: Optimización del entorno de riesgo para proteger el patrimonio y la reputación de la marca.");
        mea04.setMetricasModelo("Métrica 1: Porcentaje de iniciativas de aseguramiento independientes que fueron ejecutadas y concluidas exactamente según el plan anual de auditoría aprobado por el directorio.\nMétrica 2: Número de hallazgos críticos detectados por los auditores independientes que habían sido previamente ignorados u ocultados por las gerencias operativas.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE EVALUACIÓN INDEPENDIENTE
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea04);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA04.01");
        pract01.setNombrePractica("Planificar las iniciativas de aseguramiento");
        pract01.setDescripcionPractica("Definir el alcance exacto de las auditorías basándose en los mapas de riesgo más críticos de la organización, asegurando que los recursos de evaluación se concentren donde el peligro financiero es mayor.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Estructurar un cronograma de auditoría anual que priorice la revisión exhaustiva de los servidores de frenado autónomo vehicular por encima de los sistemas administrativos secundarios."); a1_1.setNivelCapacidadEsperado(4); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Asignar equipos de auditores especializados que posean independencia jerárquica total frente a los directores de los departamentos que serán evaluados."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA04.04");
        pract02.setNombrePractica("Ejecutar las evaluaciones de garantía corporativa");
        pract02.setDescripcionPractica("Llevar a cabo las investigaciones formales extrayendo pruebas directas de los sistemas informáticos para contrastarlas contra las políticas establecidas por la empresa.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Inspeccionar los códigos fuente de las aplicaciones comerciales y someterlos a pruebas de estrés independientes para validar que cumplen con las directrices de seguridad de la información."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Entrevistar al personal operativo y cruzar sus testimonios con las bitácoras digitales de los centros de datos para detectar posibles desviaciones en el cumplimiento de los manuales de procedimiento."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA04.08");
        pract03.setNombrePractica("Informar los hallazgos y realizar seguimiento");
        pract03.setDescripcionPractica("Emitir dictámenes formales dirigidos a la alta dirección exponiendo la verdad operativa y vigilar celosamente que las gerencias implementen las correcciones ordenadas.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Redactar informes de aseguramiento detallando las vulnerabilidades encontradas, cuantificando el riesgo económico exacto para facilitar la toma de decisiones del comité directivo."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Ejecutar revisiones de seguimiento a los noventa días de emitido el dictamen para certificar formalmente si las áreas involucradas lograron cerrar las brechas de seguridad identificadas."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        mea04.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea04); raci1.setPracticaGestion("MEA04.01"); raci1.setRolOrganizacional("Comité de Auditoría de la Junta Directiva"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea04); raci2.setPracticaGestion("MEA04.04"); raci2.setRolOrganizacional("Director Oficial de Auditoría Interna"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea04); raci3.setPracticaGestion("MEA04.08"); raci3.setRolOrganizacional("Directores Ejecutivos y Gerentes Generales"); raci3.setNivelResponsabilidad("I");

        mea04.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea04); flujo1.setPracticaGestion("MEA04.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.02"); flujo1.setDescripcion("Mapas corporativos de riesgos y perfiles de amenaza consolidados para direccionar los esfuerzos de auditoría.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea04); flujo2.setPracticaGestion("MEA04.08"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: EDM05.01"); flujo2.setDescripcion("Dictámenes de aseguramiento independiente y planes de acción vinculantes exigidos a las gerencias operativas.");

        mea04.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea04); hab1.setNombreHabilidad("Auditoría de Sistemas de Información y Evaluación de Controles Críticos"); hab1.setDocumentacionRelacionada("Marco de Aseguramiento de la Tecnología de la Información emitido por la Asociación de Auditoría y Control de Sistemas de Información"); hab1.setReferenciaEspecifica("De este marco rector internacional se adopta de forma estricta el código de ética del auditor, el cual exige independencia mental absoluta, prohibiendo que los evaluadores posean vínculos financieros o jerárquicos con las áreas tecnológicas que están inspeccionando.");

        mea04.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(mea04); pol1.setTituloPolitica("Estatuto Corporativo de Auditoría Independiente y Cero Obstrucción"); pol1.setDescripcionPolitica("Normativa fundacional aprobada directamente por la junta de accionistas, la cual otorga a los auditores internos acceso irrestricto y sin previo aviso a todos los sistemas, registros y personal de la empresa. Esta política tipifica como causal de despido fulminante cualquier intento por parte de un gerente de ocultar información, alterar bitácoras o presionar a un evaluador durante una investigación de aseguramiento."); pol1.setDocumentacionRelacionada("Carta Magna de Gobernanza y Control Institucional"); pol1.setReferenciaEspecifica("Sección: Prerrogativas de Auditoría y Régimen Disciplinario");

        mea04.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(mea04); cult1.setElementoCultural("Cultura de Transparencia y Valoración de la Auditoría"); cult1.setDocumentacionRelacionada("Manifiesto de Integridad Corporativa"); cult1.setReferenciaEspecifica("Transformar la percepción institucional para que el departamento de auditoría deje de ser visto como un organismo policial hostil, promoviendo su reconocimiento como un socio estratégico vital que ayuda a los gerentes a identificar puntos ciegos operativos antes de que estos se conviertan en desastres públicos.");

        mea04.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(mea04); serv1.setNombreServicioHerramienta("Plataformas Especializadas para la Gestión de Papeles de Trabajo y Trazabilidad de Auditorías Corporativas");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea04); serv2.setNombreServicioHerramienta("Sistemas de Extracción Forense de Datos e Inteligencia Artificial para el Muestreo de Transacciones");

        mea04.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea04);
    }
}