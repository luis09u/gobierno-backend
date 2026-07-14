package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(31) // Inicio del dominio DSS
public class Seeder_31_DSS01 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_31_DSS01(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS01")) {
            System.out.println("Iniciando carga de datos de gestión de operaciones: DSS01...");
            cargarDSS01();
            System.out.println("DSS01 (Gestión de las Operaciones) cargado exitosamente.");
        }
    }

    private void cargarDSS01() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE OPERACIÓN ININTERRUMPIDA)
        // ==========================================
        ProcesoCobit dss01 = new ProcesoCobit();
        dss01.setIdProceso("DSS01");
        dss01.setDominio("Entregar, Dar Servicio y Soporte");
        dss01.setAreaPrioritaria("Modelo Core de COBIT");
        dss01.setNombreProceso("Gestionar las operaciones");
        dss01.setDescripcionProceso("Coordinar y ejecutar las actividades y rutinas informáticas diarias requeridas para mantener los servicios tecnológicos funcionando de manera estable, segura y predecible a favor del negocio.");
        dss01.setPropositoProceso("Garantizar que los centros de datos corporativos procesen la telemetría enviada por los vehículos conectados de forma ininterrumpida, asegurando que las rutinas de respaldo de información y el monitoreo de los servidores se ejecuten sin demoras para proteger la continuidad comercial.");

        dss01.setMetasAlineamiento("AG07: Seguridad, confiabilidad e integridad ininterrumpida de la infraestructura de procesamiento de datos.\nAG08: Soporte operativo constante a los procesos comerciales mediante el uso intensivo de tecnología.");
        dss01.setMetasEmpresariales("EG06: Continuidad operativa y disponibilidad permanente de los servicios frente al consumidor final.\nEG08: Optimización absoluta de los costos logísticos y operativos institucionales.");
        dss01.setMetricasModelo("Métrica 1: Número de interrupciones en el servicio telemático causadas directamente por omisiones en el mantenimiento diario de los servidores.\nMétrica 2: Porcentaje de procesos informáticos nocturnos que finalizaron exitosamente dentro de los márgenes de tiempo estipulados.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE RUTINA OPERATIVA
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS01.01");
        pract01.setNombrePractica("Realizar procedimientos operativos estandarizados");
        pract01.setDescripcionPractica("Ejecutar las labores informáticas cotidianas siguiendo manuales estrictos para evitar errores humanos durante la administración de las plataformas.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Programar y verificar diariamente las copias de seguridad automáticas de todas las bases de datos de clientes, garantizando su resguardo físico en bóvedas segregadas geográficamente."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Ejecutar las rutinas de cierre contable y procesamiento masivo de datos durante la madrugada para no afectar el rendimiento de los sistemas de los concesionarios en horario comercial."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS01.04");
        pract02.setNombrePractica("Gestionar el entorno físico y ambiental de los equipos");
        pract02.setDescripcionPractica("Proteger las instalaciones que albergan los servidores corporativos contra amenazas climáticas o fallas en el suministro eléctrico.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Instalar y mantener sistemas de enfriamiento redundantes en los centros de datos, evitando que un sobrecalentamiento detenga los procesadores centrales."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Inspeccionar mensualmente los generadores de energía ininterrumpida para garantizar que puedan sostener la operación del sistema vehicular frente a un apagón generalizado en la ciudad."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS01.05");
        pract03.setNombrePractica("Gestionar los servicios informáticos externalizados");
        pract03.setDescripcionPractica("Supervisar de manera continua que las empresas subcontratadas que operan parte de la infraestructura cumplan con sus obligaciones operativas diarias.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Auditar las bitácoras operativas del proveedor de telecomunicaciones para asegurar que el canal de datos dedicado a la flota automotriz mantenga el ancho de banda prometido."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Establecer reuniones de control semanal con los proveedores de alojamiento en la nube para revisar las alertas de rendimiento generadas durante los últimos siete días."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss01.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss01); raci1.setPracticaGestion("DSS01.01"); raci1.setRolOrganizacional("Director de Operaciones Tecnológicas"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss01); raci2.setPracticaGestion("DSS01.04"); raci2.setRolOrganizacional("Gerente de Instalaciones Físicas y Centros de Datos"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss01); raci3.setPracticaGestion("DSS01.05"); raci3.setRolOrganizacional("Gestor Institucional de Proveedores y Terceros"); raci3.setNivelResponsabilidad("R");

        dss01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss01); flujo1.setPracticaGestion("DSS01.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI07.03"); flujo1.setDescripcion("Manuales operativos definitivos entregados junto con la aceptación comercial de los nuevos sistemas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss01); flujo2.setPracticaGestion("DSS01.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS02.01"); flujo2.setDescripcion("Bitácoras de incidencias operativas y alertas generadas por fallos en la ejecución de las rutinas de procesamiento de datos.");

        dss01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss01); hab1.setNombreHabilidad("Administración de Sistemas Informáticos y Gestión de Infraestructura Crítica"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información orientada a la Operación del Servicio"); hab1.setReferenciaEspecifica("De este compendio normativo internacional se rescata rigurosamente la estandarización de las rutinas de mantenimiento técnico y las pautas para establecer centros de comando que vigilen la estabilidad de los servicios comerciales durante las veinticuatro horas del día.");

        dss01.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss01); pol1.setTituloPolitica("Estatuto Corporativo de Monitoreo y Resguardo de la Información Comercial"); pol1.setDescripcionPolitica("Normativa de cumplimiento estricto que prohíbe la ejecución de tareas operativas críticas, tales como la migración de datos o la configuración de redes, fuera de las ventanas de mantenimiento nocturnas aprobadas, exigiendo además la verificación de las copias de seguridad de forma diaria sin excepción administrativa alguna."); pol1.setDocumentacionRelacionada("Manual Directivo de Continuidad y Operación Diaria"); pol1.setReferenciaEspecifica("Sección: Procedimientos de Control Ambiental y Custodia de Datos");

        dss01.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss01); cult1.setElementoCultural("Cultura de Rigor Procedimental y Atención Constante"); cult1.setDocumentacionRelacionada("Código de Ética Operacional"); cult1.setReferenciaEspecifica("Inculcar en el personal operativo una mentalidad de disciplina absoluta frente a los procedimientos repetitivos, promoviendo el valor estratégico de la vigilancia preventiva sobre el heroísmo improvisado frente a crisis que pudieron ser evitadas.");

        dss01.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss01); serv1.setNombreServicioHerramienta("Plataformas Digitales de Monitoreo y Programación de Tareas Automatizadas");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss01); serv2.setNombreServicioHerramienta("Sistemas Corporativos de Respaldo Criptográfico e Infraestructura de Climatización de Alta Precisión");

        dss01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss01);
    }
}