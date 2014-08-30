SECTION = "console/network"
DESCRIPTION = "framebuffer screenshot program"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea5bed2f60d357618ca161ad539f7c0a"

PR = "r2"

DEPENDS = " zlib libpng "

SRC_URI = "http://fbgrab.monells.se/fbgrab-${PV}.tar.gz;name=archive \
           file://makefile.patch \
	   file://fbgrab_1bpp.patch \
	   file://fbgrab_zlib.patch \
	   "

#	   http://people.openezx.org/ao2/fbgrab_network_mode.diff;name=patch 


do_install() {
	install -d ${D}${bindir} ${D}${mandir}/man1/
	install -m 0755 fbgrab ${D}${bindir}
	install -m 0644 fbgrab.1.man ${D}${mandir}/man1/fbgrab.1
}

SRC_URI[archive.md5sum] = "7af4d8774684182ed690d5da82d6d234"
SRC_URI[archive.sha256sum] = "9158241a20978dcc4caf0692684da9dd3640fd6f5c8b72581bd099198d670510"

