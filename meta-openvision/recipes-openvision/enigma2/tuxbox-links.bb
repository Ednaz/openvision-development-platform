require conf/license/openpli-gplv2.inc

PN = "tuxbox-links"
PV = "1.0"

do_install () {
	install -d ${D}/var
	install -d ${D}/var/spool
	install -d ${D}/usr/keys
	install -d ${D}${bindir}
	install -d ${D}/etc/cron
	install -d ${D}/etc/tuxbox/scce
	ln -s /usr/keys ${D}/var/
	ln -s ${bindir} ${D}/var/
	ln -s /etc ${D}/var/
	ln -s /etc/cron ${D}/var/spool/
	ln -s /etc/tuxbox/scce ${D}/var/
}

FILES_${PN} = "/"
