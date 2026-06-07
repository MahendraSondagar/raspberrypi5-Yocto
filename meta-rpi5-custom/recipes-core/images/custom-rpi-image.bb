SUMMARY = "A Custom RPI5 image for fun :P"

AUTHOR = "Mahendra Sondagar <mahendrasondagar08@gmail.com>"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "1048576"


# IMAGE type for the eMMC flash 
IMAGE_FSTYPES += " tar.bz2 tar.gz wic"


