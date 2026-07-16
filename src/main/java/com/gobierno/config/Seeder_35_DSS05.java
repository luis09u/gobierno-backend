package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(35) // Continuidad de las defensas operativas en el dominio DSS
public class Seeder_35_DSS05 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_35_DSS05(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS05")) {
            System.out.println("Iniciando carga de datos de servicios de seguridad: DSS05...");
            cargarDSS05();
            System.out.println("DSS05 (Gestión de los Servicios de Seguridad) cargado exitosamente.");
        }
    }

    private void cargarDSS05() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE PROTECCIÓN Y DEFENSA ACTIVA)
        // ==========================================
        ProcesoCobit dss05 = new ProcesoCobit();
        dss05.setIdProceso("DSS05");
        dss05.setDominio("Entregar, Dar Servicio y Soporte");
        dss05.setAreaPrioritaria("Modelo Core de COBIT");
        dss05.setNombreProceso("Gestionar los servicios de seguridad");
        dss05.setDescripcionProceso("Proteger permanentemente los activos tecnológicos y la información de la empresa contra ataques malintencionados, manteniendo los riesgos cibernéticos dentro de los umbrales aceptables dictaminados por la alta dirección mediante el control estricto de las identidades y el monitoreo constante del perímetro de la red.");
        dss05.setPropositoProceso("Bloquear cualquier intento de infiltración hacia los servidores centrales o hacia los sistemas telemáticos a bordo de los vehículos conectados, garantizando que los datos personales de los clientes y los secretos industriales de la marca permanezcan absolutamente resguardados bajo cualquier circunstancia operativa.");

        dss05.setMetasAlineamiento("AG07: Seguridad, confiabilidad e integridad permanente de la infraestructura de procesamiento de datos frente a vulnerabilidades internas y externas.\nAG11: Cumplimiento riguroso de las políticas corporativas en el manejo de la información.");
        dss05.setMetasEmpresariales("EG03: Cumplimiento estricto de las leyes de privacidad y normativas de seguridad dictadas por entidades gubernamentales.\nEG06: Continuidad operativa y disponibilidad ininterrumpida de los servicios de movilidad conectada.");
        dss05.setMetricasModelo("Métrica 1: Porcentaje de intentos de intrusión informática que fueron neutralizados de manera automática por las defensas perimetrales sin causar interrupciones operativas.\nMétrica 2: Número de incidentes de seguridad que lograron vulnerar los sistemas de control de identidad corporativa durante el año en curso.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE DEFENSA CIBERNÉTICA
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss05);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS05.01");
        pract01.setNombrePractica("Proteger contra código informático malicioso");
        pract01.setDescripcionPractica("Implementar medidas preventivas y reactivas para evitar que programas destructivos o de espionaje infecten las redes de la organización.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Desplegar sistemas de protección avanzada en todos los equipos de la compañía, logrando detectar y neutralizar virus informáticos antes de que puedan cifrar la información de los usuarios."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Configurar las bandejas de correo institucional para rechazar automáticamente cualquier archivo adjunto ejecutable que no cuente con una firma criptográfica autorizada."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS05.02");
        pract02.setNombrePractica("Gestionar la seguridad de la red y las comunicaciones");
        pract02.setDescripcionPractica("Establecer barreras virtuales impenetrables para filtrar el tráfico de datos, asegurando que solo las conexiones seguras y verificadas ingresen al centro de procesamiento.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Instalar y configurar cortafuegos perimetrales que segmenten la red corporativa, separando estrictamente los servidores financieros de los sistemas de telecomunicación vehicular."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Exigir el uso de túneles virtuales encriptados para cualquier empleado que requiera acceder a los recursos de la empresa desde ubicaciones externas o conexiones públicas."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS05.04");
        pract03.setNombrePractica("Gestionar la identidad y los accesos lógicos");
        pract03.setDescripcionPractica("Controlar de manera férrea quién ingresa a los sistemas, garantizando que cada colaborador reciba únicamente los privilegios informáticos necesarios para cumplir su labor específica.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Aplicar el principio de privilegios mínimos en toda la organización, lo cual significa que un empleado de ventas jamás tendrá permisos para modificar la configuración de los servidores técnicos."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Auditar semestralmente las cuentas de usuario activas y proceder con la eliminación inmediata de todas aquellas credenciales pertenecientes a personal que ya no labora en la institución."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss05.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss05); raci1.setPracticaGestion("DSS05.01"); raci1.setRolOrganizacional("Director de Seguridad de la Información Operativa"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss05); raci2.setPracticaGestion("DSS05.02"); raci2.setRolOrganizacional("Administradores de Redes y Perímetros de Defensa"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss05); raci3.setPracticaGestion("DSS05.04"); raci3.setRolOrganizacional("Gestor Institucional de Identidades y Accesos"); raci3.setNivelResponsabilidad("R");

        dss05.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss05); flujo1.setPracticaGestion("DSS05.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO13.01"); flujo1.setDescripcion("Políticas maestras de seguridad de la información y arquitecturas de defensa corporativa aprobadas por la directiva.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss05); flujo2.setPracticaGestion("DSS05.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA02.01"); flujo2.setDescripcion("Registros de auditoría sobre los accesos bloqueados y alertas generadas por intentos de autenticación fraudulenta.");

        dss05.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss05); hab1.setNombreHabilidad("Defensa Cibernética y Criptografía Aplicada a Redes Complejas"); hab1.setDocumentacionRelacionada("Estándar Internacional de Seguridad de la Información ISO 27001 dictado por la Organización Internacional de Normalización"); hab1.setReferenciaEspecifica("De esta normativa mundial se rescata detalladamente el modelo de mejora continua para la gestión de controles criptográficos, permitiendo estructurar defensas perimetrales sólidas que evolucionan al mismo ritmo que las amenazas externas.");

        dss05.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss05); pol1.setTituloPolitica("Directiva de Confianza Cero y Revocación Inmediata de Credenciales"); pol1.setDescripcionPolitica("Normativa institucional irrevocable que prohíbe el uso de cuentas de acceso genéricas o compartidas dentro de la organización. Asimismo, esta política dictamina que las credenciales de cualquier empleado desvinculado deben ser desactivadas en un plazo máximo de quince minutos desde el momento de la notificación administrativa."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Control de Accesos"); pol1.setReferenciaEspecifica("Sección: Autenticación Individual y Remoción de Privilegios");

        dss05.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss05); cult1.setElementoCultural("Cultura de Desconfianza Preventiva y Responsabilidad Compartida"); cult1.setDocumentacionRelacionada("Código de Integridad Tecnológica"); cult1.setReferenciaEspecifica("Fomentar en todos los colaboradores la premisa de que todo enlace o correo electrónico inusual representa una amenaza potencial para la empresa, educando al personal para que comprenda que la seguridad informática no es responsabilidad exclusiva del departamento técnico, sino un deber de cada empleado.");

        dss05.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss05); serv1.setNombreServicioHerramienta("Plataformas de Prevención de Intrusiones y Cortafuegos Corporativos de Análisis Profundo");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss05); serv2.setNombreServicioHerramienta("Sistemas de Gestión de Identidades y Plataformas de Autenticación de Múltiples Factores");

        dss05.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss05);
    }
}