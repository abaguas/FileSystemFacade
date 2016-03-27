JAVADIR=../../jars
JARNAME=poof-core

all:
	(cd src; javac -encoding UTF-8 `find . -name \*.java`)
	(cd src; jar cvf ../$(JARNAME).jar `find . -name \*.class -o -name \*.java`)
	(make install)

clean:
	$(RM) $(JARNAME).jar `find . -name \*.class`
	(cd ../../jars; $(RM) $(JARNAME).jar)

install:
	cp $(JARNAME).jar $(JAVADIR)
