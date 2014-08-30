DESCRIPTION = "Init script for Clancor_HHC"
LICENSE = "GPL"
SRC_URI += "file://clancor-qt-sdk72xx-init"
SRC_URI += "file://resolv.conf"
SRC_URI += "file://release"
SRC_URI += "file://rotation"
SRC_URI += "file://provider"
SRC_URI += "file://airtel"
SRC_URI += "file://aircel"
SRC_URI += "file://bsnl"
SRC_URI += "file://vodafone"
SRC_URI += "file://idea"
SRC_URI += "file://docomo"
SRC_URI += "file://mts"
SRC_URI += "file://reliance"
SRC_URI += "file://uninor"
SRC_URI += "file://videocon"
SRC_URI += "file://virgin"
SRC_URI += "file://ppp-off"
SRC_URI += "file://pcscd"
SRC_URI += "file://rtk8723a.bin"
SRC_URI += "file://wifi.sh"
SRC_URI += "file://dnsserver"
SRC_URI += "file://options.cmux2"
SRC_URI += "file://options.ttyS1"

PR = "r1"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

do_install() {
	install -d ${D}${sysconfdir}/
	install -d ${D}${sysconfdir}/init.d/
	install -d ${D}${sysconfdir}/ppp/
	install -d ${D}${sysconfdir}/ppp/peers/
	install -d ${D}${sysconfdir}/ppp/chatscripts/
	install -d ${D}/lib/firmware/rtk_bt/
	install -d ${D}/opt/sdk72xx/resources/
	install -m 0755 ${WORKDIR}/resolv.conf ${D}${sysconfdir}/
	install -m 0755 ${WORKDIR}/release ${D}${sysconfdir}/
	install -m 0755 ${WORKDIR}/rotation ${D}${sysconfdir}/
	install -m 0755 ${WORKDIR}/dnsserver ${D}${sysconfdir}/
	install -m 0755 ${WORKDIR}/clancor-qt-sdk72xx-init ${D}${sysconfdir}/init.d/clancorsdk
	install -m 0755 ${WORKDIR}/pcscd ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/provider ${D}${sysconfdir}/ppp/peers/
	install -m 0755 ${WORKDIR}/ppp-off ${D}${sysconfdir}/ppp/peers/
	install -m 0755 ${WORKDIR}/airtel ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/aircel ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/bsnl ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/vodafone ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/idea ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/docomo ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/mts ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/reliance ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/uninor ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/videocon ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/virgin ${D}${sysconfdir}/ppp/chatscripts/
	install -m 0755 ${WORKDIR}/options.cmux2 ${D}${sysconfdir}/ppp/
	install -m 0755 ${WORKDIR}/options.ttyS1 ${D}${sysconfdir}/ppp/
	install -m 0755 ${WORKDIR}/rtk8723a.bin ${D}/lib/firmware/rtk_bt
	install -m 0755 ${WORKDIR}/wifi.sh ${D}/opt/sdk72xx/resources/
}

inherit update-rc.d allarch

INITSCRIPT_NAME = "clancorsdk"
INITSCRIPT_PARAMS = "start 99 5 2 . stop 19 0 1 6 ."