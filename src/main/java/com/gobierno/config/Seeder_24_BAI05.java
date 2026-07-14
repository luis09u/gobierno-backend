package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(24) // Continuación del despliegue en el dominio BAI
public class Seeder_24_BAI05 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_24_BAI05(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI05")) {
            System.out.println("Iniciando carga de datos de gestión del cambio humano: BAI05...");
            cargarBAI05();
            System.out.println("BAI05 (Gestión de los Cambios Organizativos) cargado exitosamente.");
        }
    }

    private void cargarBAI05() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE TRANSFORMACIÓN HUMANA)
        // ==========================================
        ProcesoCobit bai05 = new ProcesoCobit();
        bai05.setIdProceso("BAI05");
        bai05.setDominio("Construir, Adquirir e Implementar");
        bai05.setAreaPrioritaria("Modelo Core de COBIT");
        bai05.setNombreProceso("Gestionar los cambios organizativos");
        bai05.setDescripcionProceso("Maximizar la probabilidad de implementar con éxito las transformaciones tecnológicas en la empresa mediante una conducción metódica de los recursos humanos. Esta labor requiere preparar a los colaboradores frente a los nuevos procesos, reducir la fricción institucional y asegurar la asimilación definitiva de las nuevas plataformas de trabajo.");
        bai05.setPropositoProceso("Garantizar que la adopción de nuevas plataformas de diagnóstico vehicular y sistemas conectados no genere parálisis operativa ni rechazo por parte de los trabajadores de los concesionarios o del equipo corporativo, logrando una transición armoniosa hacia las nuevas exigencias del mercado automotriz.");

        bai05.setMetasAlineamiento("AG12: Personal competente y motivado con una comprensión mutua de los objetivos institucionales.\nAG08: Habilitación y respaldo absoluto a los procesos comerciales mediante herramientas digitales.");
        bai05.setMetasEmpresariales("EG09: Personal corporativo con las habilidades idóneas y altamente comprometido.\nEG05: Cultura de innovación orientada a la satisfacción del consumidor final.");
        bai05.setMetricasModelo("Métrica 1: Porcentaje de los colaboradores técnicos que completaron con éxito los programas de entrenamiento para las nuevas plataformas de diagnóstico vehicular.\nMétrica 2: Índice de reducción de errores operativos manuales reportados tras el primer mes de despliegue del nuevo sistema informático.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE ADOPCIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai05);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI05.01");
        pract01.setNombrePractica("Establecer el sentido de urgencia y el deseo de cambio");
        pract01.setDescripcionPractica("Comunicar claramente a toda la organización las razones estratégicas por las cuales la modernización tecnológica es vital para la supervivencia comercial de la empresa.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Ejecutar campañas de comunicación interna detallando cómo los nuevos sistemas de conectividad en los automóviles protegerán el liderazgo de la marca frente a los competidores internacionales."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Identificar de forma temprana a los grupos de colaboradores institucionales que presenten mayor riesgo de resistencia frente a las nuevas herramientas de gestión técnica."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI05.04");
        pract02.setNombrePractica("Capacitar y habilitar al personal institucional");
        pract02.setDescripcionPractica("Diseñar e impartir los conocimientos técnicos precisos para que los empleados adquieran confianza al utilizar las herramientas recién desarrolladas.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Elaborar manuales operativos simplificados y ejecutar talleres prácticos orientados exclusivamente al personal de atención al cliente en los concesionarios automotrices."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Designar embajadores tecnológicos dentro de cada gerencia para que brinden apoyo inmediato a sus compañeros durante las primeras semanas de la transición digital."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI05.06");
        pract03.setNombrePractica("Sostener los cambios implementados");
        pract03.setDescripcionPractica("Aplicar mecanismos de control y reconocimiento laboral para evitar que los trabajadores regresen a sus antiguas rutinas informáticas por hábito o costumbre.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Auditar el nivel de uso real de las nuevas plataformas e inhabilitar definitivamente el acceso a los sistemas antiguos una vez finalizado el periodo de gracia institucional."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Vincular la correcta utilización de los nuevos procedimientos tecnológicos de atención automotriz con las evaluaciones de desempeño anuales del personal."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai05.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai05); raci1.setPracticaGestion("BAI05.01"); raci1.setRolOrganizacional("Dirección Ejecutiva General"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai05); raci2.setPracticaGestion("BAI05.04"); raci2.setRolOrganizacional("Gerencia de Recursos Humanos y Capacitación"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai05); raci3.setPracticaGestion("BAI05.06"); raci3.setRolOrganizacional("Líderes de Unidades Operativas"); raci3.setNivelResponsabilidad("R");

        bai05.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai05); flujo1.setPracticaGestion("BAI05.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO02.05"); flujo1.setDescripcion("Objetivos estratégicos de digitalización institucional y justificación económica del proyecto.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai05); flujo2.setPracticaGestion("BAI05.06"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI08.01"); flujo2.setDescripcion("Resultados formales sobre el nivel de asimilación tecnológica e identificación de vacíos de conocimiento para la base de datos corporativa.");

        bai05.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai05); hab1.setNombreHabilidad("Dirección Estratégica de la Transformación Empresarial"); hab1.setDocumentacionRelacionada("Marco Internacional de Gestión del Cambio Organizacional dictado por el Instituto Kotter"); hab1.setReferenciaEspecifica("De este marco normativo se rescata estrictamente la metodología para conformar coaliciones de liderazgo transversal y la técnica para eliminar los obstáculos administrativos que frenan la adopción de nuevas herramientas de trabajo por parte de los empleados.");

        bai05.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai05); pol1.setTituloPolitica("Estatuto Corporativo de Transición y Adopción Digital"); pol1.setDescripcionPolitica("Normativa institucional que prohíbe el lanzamiento oficial de cualquier plataforma tecnológica dirigida al personal interno sin antes haber certificado que al menos el ochenta por ciento de los usuarios finales cursaron y aprobaron las evaluaciones de capacitación correspondientes."); pol1.setDocumentacionRelacionada("Manual Institucional de Capital Humano"); pol1.setReferenciaEspecifica("Sección: Requisitos Obligatorios para la Activación de Sistemas en Producción");

        bai05.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai05); cult1.setElementoCultural("Cultura de Flexibilidad y Adaptación Constante"); cult1.setDocumentacionRelacionada("Código de Valores Institucionales"); cult1.setReferenciaEspecifica("Promover a nivel directivo un ambiente de contención donde el error temprano durante el aprendizaje de nuevas herramientas sea tolerado e instruido, erradicando la cultura punitiva que fomenta el miedo a interactuar con los nuevos sistemas automatizados.");

        bai05.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai05); serv1.setNombreServicioHerramienta("Plataformas Digitales de Aprendizaje y Certificación Corporativa");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai05); serv2.setNombreServicioHerramienta("Sistemas Analíticos para la Medición del Clima Laboral y Encuestas de Satisfacción Interna");

        bai05.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai05);
    }
}