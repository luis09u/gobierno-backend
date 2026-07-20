package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(35) // Secuencia en el dominio DSS
public class Seeder_35_DSS05 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_35_DSS05(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS05")) {
            System.out.println("Iniciando carga de datos oficiales: DSS05...");
            cargarDSS05();
            System.out.println("DSS05 (Gestionar los servicios de seguridad) cargado exitosamente.");
        }
    }

    private void cargarDSS05() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit dss05 = new ProcesoCobit();
        dss05.setIdProceso("DSS05");
        dss05.setDominio("Entregar, Dar Servicio y Soporte");
        dss05.setAreaPrioritaria("Modelo Core de COBIT");
        dss05.setNombreProceso("Gestionar los servicios de seguridad");
        dss05.setDescripcionProceso("Proteger la información de la empresa para mantener el nivel de riesgo de seguridad aceptable. Establecer y mantener roles y privilegios de acceso, y realizar monitorización continua de la seguridad.");
        dss05.setPropositoProceso("Minimizar el impacto en el negocio de incidentes operativos de ciberseguridad, bloqueando intentos de infiltración en la red 5G del automóvil y aislando posibles ataques (Zero-Day) al firmware de las ECUs.");

        dss05.setMetasAlineamiento("AG02: Gestión de riesgo relacionado con I&T.\nAG07: Seguridad de la información, infraestructura y privacidad.");
        dss05.setMetasEmpresariales("EG02: Gestión de riesgo del negocio.\nEG06: Continuidad y disponibilidad del servicio del negocio.");
        dss05.setMetricasModelo("Métrica 1: Número de incidentes de integridad vehicular que causan pérdidas financieras o descrédito público (AG07).\nMétrica 2: Número de ataques exitosos de inyección de código (malware) sobre el sistema operativo del auto (DSS05.01).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss05);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS05.01");
        pract01.setNombrePractica("Proteger contra software malicioso");
        pract01.setDescripcionPractica("Implementar medidas preventivas en los servidores y ECUs para proteger la infraestructura vehicular contra malware o ransomware distribuido por aire.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Instalar y activar protección contra inyección de código malicioso en todas las instalaciones de backend, con firmas de virus actualizadas."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Filtrar rigurosamente el tráfico entrante al vehículo, bloqueando cualquier paquete de actualización no firmado criptográficamente por la marca."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Revisar y evaluar proactivamente las advertencias globales de la industria automotriz sobre vulnerabilidades de software y nuevas tácticas de intrusión."); a1_3.setNivelCapacidadEsperado(4); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS05.02");
        pract02.setNombrePractica("Gestionar la seguridad de la conectividad y de la red");
        pract02.setDescripcionPractica("Usar medidas de seguridad estrictas (Firewalls, IPS) para proteger el túnel de comunicación cifrada entre la nube y el Gateway del vehículo.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Permitir que solo dispositivos autorizados (VINs registrados) accedan a los servidores de la empresa. Implementar firewalls para filtrar tráfico no legítimo."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Cifrar toda la telemetría y metadatos de los conductores (información en tránsito) utilizando protocolos TLS/mTLS en la conexión celular."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Llevar a cabo pruebas de penetración periódicas en los módulos de red del auto para validar la resistencia de los puertos de diagnóstico."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS05.03");
        pract03.setNombrePractica("Gestionar la seguridad de endpoint");
        pract03.setDescripcionPractica("Garantizar que los dispositivos finales, como las unidades de infoentretenimiento de la cabina, tengan seguridad robusta para evitar accesos laterales al motor.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Configurar los sistemas operativos vehiculares (Arene OS) de forma segura, deshabilitando todos los puertos USB y protocolos Bluetooth no esenciales."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Implementar mecanismos estrictos de separación lógica, evitando que las redes de entretenimiento (WiFi del pasajero) se comuniquen con el CAN bus del motor."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Cifrar la información confidencial de los usuarios almacenada en la memoria local del vehículo (navegación, perfiles) frente a extracciones de hardware."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("DSS05.04");
        pract04.setNombrePractica("Gestionar la identidad del usuario y el acceso lógico");
        pract04.setDescripcionPractica("Controlar estrictamente quién tiene acceso a los sistemas de diseño de software y servidores de despliegue OTA, mediante mínimos privilegios.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Mantener los derechos de acceso de los ingenieros alineados con el principio de menor privilegio y la necesidad de conocer para acceder al código fuente."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Segregar, reducir al mínimo y monitorizar activamente las cuentas con privilegios administrativos (Root) en los servidores Cloud de producción."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Mantener un registro de auditoría inmutable de todo acceso lógico a repositorios críticos para facilitar investigaciones forenses de filtraciones."); a4_3.setNivelCapacidadEsperado(4); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("DSS05.05");
        pract05.setNombrePractica("Gestionar el acceso físico a los activos de I&T");
        pract05.setDescripcionPractica("Limitar y registrar el acceso físico a los laboratorios de simulación automotriz y Centros de Datos para evitar manipulación del hardware.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Registrar y monitorizar todos los puntos de entrada a las instalaciones de I&T, requiriendo credenciales autorizadas en laboratorios automotrices."); a5_1.setNivelCapacidadEsperado(2); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Garantizar que los perfiles de acceso permanezcan actualizados según rol. Restringir el ingreso a las salas de servidores centrales."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Realizar formación sobre concienciación de la seguridad de la información física (Ingeniería Social, Tailgating) de forma regular a los empleados."); a5_3.setNivelCapacidadEsperado(3); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        // Práctica 6
        PracticaCobit pract06 = new PracticaCobit();
        pract06.setComponente(compA);
        pract06.setIdPractica("DSS05.06");
        pract06.setNombrePractica("Gestionar documentos sensibles y dispositivos de salida");
        pract06.setDescripcionPractica("Establecer protección física y controles criptográficos sobre hardware (tokens RSA, laptops) que contengan planos de arquitectura o llaves de firma de software.");
        Actividad a6_1 = new Actividad(); a6_1.setPractica(pract06); a6_1.setDescripcionActividad("Establecer procedimientos rigurosos para el retiro y destrucción de dispositivos lógicos que albergaron código base del vehículo."); a6_1.setNivelCapacidadEsperado(2); a6_1.setCalificacionActual("N");
        Actividad a6_2 = new Actividad(); a6_2.setPractica(pract06); a6_2.setDescripcionActividad("Asegurar que se han establecido controles criptográficos en discos duros portátiles y laptops corporativas de los desarrolladores."); a6_2.setNivelCapacidadEsperado(3); a6_2.setCalificacionActual("N");
        Actividad a6_3 = new Actividad(); a6_3.setPractica(pract06); a6_3.setDescripcionActividad("Mantener un inventario estricto de todos los tokens de seguridad y certificados raíz usados para autorizar el software OTA."); a6_3.setNivelCapacidadEsperado(3); a6_3.setCalificacionActual("N");
        pract06.setActividades(Arrays.asList(a6_1, a6_2, a6_3));

        // Práctica 7
        PracticaCobit pract07 = new PracticaCobit();
        pract07.setComponente(compA);
        pract07.setIdPractica("DSS05.07");
        pract07.setNombrePractica("Gestionar vulnerabilidades y monitorizar la infraestructura (SOC)");
        pract07.setDescripcionPractica("Operar un Centro de Operaciones de Seguridad (SOC) utilizando SIEM para detectar, correlacionar y bloquear ataques a los servidores o la red vehicular.");
        Actividad a7_1 = new Actividad(); a7_1.setPractica(pract07); a7_1.setDescripcionActividad("Usar escáneres de vulnerabilidad para identificar debilidades en el backend de la nube antes de que sean explotadas por ciberdelincuentes."); a7_1.setNivelCapacidadEsperado(2); a7_1.setCalificacionActual("N");
        Actividad a7_2 = new Actividad(); a7_2.setPractica(pract07); a7_2.setDescripcionActividad("Registrar eventos relacionados con la seguridad (logs) y conservar los registros durante el tiempo exigido por las regulaciones internacionales."); a7_2.setNivelCapacidadEsperado(3); a7_2.setCalificacionActual("N");
        Actividad a7_3 = new Actividad(); a7_3.setPractica(pract07); a7_3.setDescripcionActividad("Garantizar que se creen alertas de incidentes automáticas cuando la monitorización (SIEM) detecte patrones anómalos de tráfico hacia los autos."); a7_3.setNivelCapacidadEsperado(4); a7_3.setCalificacionActual("N");
        pract07.setActividades(Arrays.asList(a7_1, a7_2, a7_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05, pract06, pract07));
        dss05.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss05); raci1.setPracticaGestion("DSS05.01"); raci1.setRolOrganizacional("Director de seguridad de la información (CISO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss05); raci2.setPracticaGestion("DSS05.02"); raci2.setRolOrganizacional("Director de seguridad de la información"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss05); raci3.setPracticaGestion("DSS05.07"); raci3.setRolOrganizacional("Director de seguridad de la información / Gestor de seguridad"); raci3.setNivelResponsabilidad("A");
        dss05.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss05); flujo1.setPracticaGestion("DSS05.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.02 / APO12.03"); flujo1.setDescripcion("Evaluaciones de amenazas potenciales cibernéticas en el portafolio de I&T.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss05); flujo2.setPracticaGestion("DSS05.07"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS02.02"); flujo2.setDescripcion("Tickets relacionados con incidentes de seguridad e inyecciones de código detectadas.");
        dss05.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss05); hab1.setNombreHabilidad("Pruebas de Penetración y Gestión de Seguridad (Ciberseguridad)"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: PENT / SCAD. Experiencia comprobada en hacking ético automotriz y administración perimetral.");
        dss05.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss05); pol1.setTituloPolitica("Política de Ciberseguridad de la Información Automotriz"); pol1.setDescripcionPolitica("Establecer directrices inquebrantables de Zero Trust para proteger el código fuente, las llaves de cifrado y el puente de comunicación de las plataformas conectadas de la compañía."); pol1.setDocumentacionRelacionada("WP.29 Cyber Security Management System (CSMS)"); pol1.setReferenciaEspecifica("Regulación internacional de Naciones Unidas para vehículos conectados.");
        dss05.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss05); cult1.setElementoCultural("Cultura de Responsabilidad (Security is Everyone's Job)"); cult1.setDocumentacionRelacionada("Creating a Culture of Security, ISACA, 2011"); cult1.setReferenciaEspecifica("Crear una cultura de concienciación sobre la responsabilidad individual. Proveer formación para que los ingenieros asimilen que una brecha en la red vehicular puede comprometer la vida de los pasajeros.");
        dss05.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss05); serv1.setNombreServicioHerramienta("Herramientas de Información de Seguridad y Gestión de Eventos (SIEM)");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss05); serv2.setNombreServicioHerramienta("Servicios de pruebas de penetración (Pen-Testing) de terceros");
        dss05.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss05);
    }
}