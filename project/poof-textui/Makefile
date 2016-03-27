JAVADIR=../../jars
JARNAME=poof-textui

all:
	(cd src; javac -encoding UTF-8 -cp ../$(JAVADIR)/po-uilib.jar:../$(JAVADIR)/poof-support.jar:../$(JAVADIR)/poof-core.jar `find . -name \*.java`)
	(cd src; jar cvf ../$(JARNAME).jar `find . -name \*.class -o -name \*.java`)
	(make install)

clean:
	$(RM) $(JARNAME).jar `find . -name \*.class`
	(cd ../../jars; $(RM) $(JARNAME).jar)

install:
	/bin/cp $(JARNAME).jar $(JAVADIR)
