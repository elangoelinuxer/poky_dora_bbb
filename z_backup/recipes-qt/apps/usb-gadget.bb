DESCRIPTION = "Init script for Gadget"
LICENSE = "GPL"
SRC_URI += "file://usb-gadget"
SRC_URI += "file://usb-gadget.conf"

PR = "r1"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

do_install() {
	install -d ${D}${sysconfdir}/
	install -d ${D}${sysconfdir}/default/
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/usb-gadget ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/usb-gadget.conf ${D}${sysconfdir}/default/
}

inherit update-rc.d allarch

INITSCRIPT_NAME = "usb-gadget"
INITSCRIPT_PARAMS = "start 99 5 2 . stop 19 0 1 6 ."
