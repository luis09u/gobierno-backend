package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(19) // Cierre del dominio APO
public class Seeder_19_APO14 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_19_APO14(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO14")) {
            System.out.println("Iniciando carga de datos de gestión corporativa de la información: APO14...");
            cargarAPO14();
            System.out.println("APO14 (Gestión de los Datos) cargado exitosamente.");
        }
    }

    private void cargarAPO14() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE GOBERNANZA DE INFORMACIÓN)
        // ==========================================
        ProcesoCobit apo14 = new ProcesoCobit();
        apo14.setIdProceso("APO14");
        apo14.setDominio("Alinear, Planificar y Organizar");
        apo14.setAreaPrioritaria("Modelo Core de COBIT");
        apo14.setNombreProceso("Gestionar los datos");
        apo14.setDescripcionProceso("Optimizar y controlar el ciclo de vida completo de la información corporativa, estableciendo prácticas formales de categorización, retención y depuración para asegurar que los datos generados sean exactos, confiables y estrictamente confidenciales.");
        apo14.setPropositoProceso("Garantizar que toda la información técnica, de ubicación y de diagnóstico recopilada de los vehículos se procese respetando el derecho a la privacidad del conductor, generando al mismo tiempo valor analítico para mejorar el diseño de futuros modelos automotrices.");

        apo14.setMetasAlineamiento("AG10: Calidad, oportunidad y exactitud de la información corporativa para la toma de decisiones.\nAG07: Seguridad e integridad permanente de las bases de datos.");
        apo14.setMetasEmpresariales("EG03: Cumplimiento estricto de leyes de protección a la privacidad y regulaciones sectoriales.\nEG04: Alta calidad en los informes de gestión directiva.");
        apo14.setMetricasModelo("Métrica 1: Porcentaje de los registros de clientes clasificados y encriptados según las normativas internacionales de protección a la privacidad.\nMétrica 2: Número de notificaciones de advertencia por uso indebido o retención excesiva de información personal de los usuarios.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE CONTROL
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo14);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO14.01");
        pract01.setNombrePractica("Definir y comunicar la estrategia de gestión de información");
        pract01.setDescripcionPractica("Establecer un esquema corporativo que clasifique el grado de sensibilidad de cada tipo de información recopilada por la empresa.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Catalogar la información del sistema de posicionamiento global del vehículo como dato altamente confidencial, restringiendo su acceso interno."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Designar custodios oficiales responsables de la integridad de los registros operativos generados por el motor y los frenos."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO14.02");
        pract02.setNombrePractica("Gestionar la calidad de la información");
        pract02.setDescripcionPractica("Asegurar que los datos transmitidos desde los vehículos hacia los servidores centrales no sufran alteraciones o corrupciones en el trayecto.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Implementar reglas de validación automática para descartar lecturas defectuosas o incompletas de los sensores del automóvil antes de almacenarlas."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Ejecutar procesos de depuración periódica para eliminar registros duplicados en las bases de datos corporativas."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO14.04");
        pract03.setNombrePractica("Gestionar el ciclo de vida y archivo documental");
        pract03.setDescripcionPractica("Definir los tiempos legales de conservación de los registros y garantizar su eliminación permanente una vez expirado dicho plazo.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Programar el borrado automático del historial de rutas y recorridos del cliente tras superar el límite de tiempo establecido por la normativa legal."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Establecer bóvedas digitales de almacenamiento a largo plazo para conservar evidencia de las actualizaciones de seguridad transmitidas a la flota, en caso de auditorías judiciales."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo14.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo14); raci1.setPracticaGestion("APO14.01"); raci1.setRolOrganizacional("Director Ejecutivo de Datos (CDO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo14); raci2.setPracticaGestion("APO14.02"); raci2.setRolOrganizacional("Gerencia de Analítica e Inteligencia Institucional"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo14); raci3.setPracticaGestion("APO14.04"); raci3.setRolOrganizacional("Dirección Jurídica y Cumplimiento Normativo"); raci3.setNivelResponsabilidad("C");

        apo14.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo14); flujo1.setPracticaGestion("APO14.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: EDM03.02"); flujo1.setDescripcion("Normativas gubernamentales sobre tratamiento de datos personales y privacidad del usuario.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo14); flujo2.setPracticaGestion("APO14.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los procesos de TI"); flujo2.setDescripcion("Políticas de retención, acceso y destrucción segura de registros corporativos.");

        apo14.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo14); hab1.setNombreHabilidad("Gobernanza y Administración de Bases de Datos"); hab1.setDocumentacionRelacionada("Marco de Gestión de la Información (DAMA-DMBOK)"); hab1.setReferenciaEspecifica("Clasificación de activos de información, aseguramiento de la privacidad y modelado de arquitecturas de bases de datos centralizadas.");

        apo14.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo14); pol1.setTituloPolitica("Directiva Corporativa de Privacidad y Anonimización de la Información"); pol1.setDescripcionPolitica("Normativa inviolable que exige que toda información relacionada con los hábitos de conducción sea disociada de la identidad del propietario del vehículo antes de ser utilizada para análisis estadísticos, prohibiendo absolutamente su comercialización a entidades externas sin consentimiento expreso."); pol1.setDocumentacionRelacionada("Estatuto de Ética en el Tratamiento de la Información"); pol1.setReferenciaEspecifica("Sección: Privacidad del Consumidor y Secreto Operativo");

        apo14.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE PRIVACIDAD
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo14); cult1.setElementoCultural("Cultura de Respeto a la Privacidad como Pilar de Marca"); cult1.setDocumentacionRelacionada("Manifiesto de Valores Institucionales"); cult1.setReferenciaEspecifica("Inculcar en la organización que la información proporcionada por los clientes no es propiedad de la empresa, sino un activo confiado que debe ser custodiado con el máximo grado de ética y transparencia.");

        apo14.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo14); serv1.setNombreServicioHerramienta("Plataformas Centralizadas de Gestión de Bases de Datos (SGBD Corporativos)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo14); serv2.setNombreServicioHerramienta("Herramientas de Catalogación de Datos e Identificación Automática de Información Confidencial");

        apo14.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo14);
    }
}